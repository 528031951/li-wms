package com.bpm.gd.wms.outbound.server.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bpm.gd.wms.outbound.common.util.ResultUtil;
import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.configration.UrlConfig;
import com.bpm.gd.wms.outbound.server.domain.*;
import com.bpm.gd.wms.outbound.server.dto.ProductOutBoundDTO;
import com.bpm.gd.wms.outbound.server.dto.TPCodeDTO;
import com.bpm.gd.wms.outbound.server.mapper.base.BaseDepotManagementMapper;
import com.bpm.gd.wms.outbound.server.mapper.base.BaseDepotToCaseMapper;
import com.bpm.gd.wms.outbound.server.mapper.base.CougnyTransferOrderProductMapper;
import com.bpm.gd.wms.outbound.server.mapper.base.WarehousingOutRecordMapper;
import com.bpm.gd.wms.outbound.server.mapper.ext.BaseDepotToCaseExtMapper;
import com.bpm.gd.wms.outbound.server.mapper.ext.BaseDepotToMatterExtMapper;
import com.bpm.gd.wms.outbound.server.mapper.ext.OutBoundSaleShipmentExtMapper;
import com.bpm.gd.wms.outbound.server.mapper.ext.WarehousingByTrayExtMapper;
import com.bpm.gd.wms.outbound.server.service.ProductOutBoundService;
import com.bpm.gd.wms.outbound.server.vo.BoxInfoVO;
import com.bpm.gd.wms.outbound.server.vo.ProductVO;
import com.bpm.gd.wms.outbound.server.vo.TrayInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

/**
 * @Author Super Young
 * @Date 2020/8/17 10:35
 */
@Service
public class ProductOutBoundServiceImpl implements ProductOutBoundService {

    @Autowired
    private CougnyTransferOrderProductMapper cougnyTransferOrderProductMapper;

    @Autowired
    private BaseDepotToMatterExtMapper baseDepotToMatterExtMapper;

    @Autowired
    private WarehousingByTrayExtMapper warehousingByTrayExtMapper;

    @Autowired
    private BaseDepotManagementMapper baseDepotManagementMapper;

    @Autowired
    private BaseDepotToCaseExtMapper baseDepotToCaseExtMapper;

    @Autowired
    private WarehousingOutRecordMapper warehousingOutRecordMapper;

    @Autowired
    private OutBoundSaleShipmentExtMapper outBoundSaleShipmentExtMapper;

    @Autowired
    private UrlConfig urlConfig;

    @Override
    public ResultVO outBound(ProductOutBoundDTO productOutBoundDTO) {
        String trayNo = productOutBoundDTO.getTrayNo();//托盘号或者箱号
        //添加到成品出库表
        CougnyTransferOrderProduct cougnyTransferOrderProduct = new CougnyTransferOrderProduct();
        cougnyTransferOrderProduct.setCougnyTime(new Date());
        cougnyTransferOrderProduct.setCreateTime(new Date());
        //发送http请求，获取所需数据
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        TPCodeDTO tpCodeDTO = new TPCodeDTO();
        tpCodeDTO.setBarcode(trayNo);
        String json = JSONObject.toJSONString(tpCodeDTO);
        HttpEntity<String> entity = new HttpEntity<String>(json, headers);
        //出库记录
        WarehousingOutRecord warehousingOutRecord = new WarehousingOutRecord();
        warehousingOutRecord.setStorageNo(productOutBoundDTO.getStorageNo());
        warehousingOutRecord.setWarehousingOutType("3");
        warehousingOutRecord.setWarehousingOutTime(new Date());
        warehousingOutRecord.setOrderNo(productOutBoundDTO.getOutOrderCode());
        warehousingOutRecord.setStatus("1");
        warehousingOutRecord.setUnit("PCS");
        warehousingOutRecord.setBoxNo(trayNo);
        //判断扫的是托盘还是箱子
        int caseCount=baseDepotToCaseExtMapper.selectByCaseNo(trayNo);
        if (caseCount>0){
            //扫箱子
            cougnyTransferOrderProduct.setCaseNo(trayNo);
            //查询箱子中成品信息
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(urlConfig.getMesOrderBoxUrl(), entity, String.class);
            String response = responseEntity.getBody();
            JSONObject jsonObject = JSONObject.parseObject(response);
            JSONObject data = JSONObject.parseObject(jsonObject.getString("data"));
            BoxInfoVO boxInfoVO=JSONObject.toJavaObject(data,BoxInfoVO.class);
            //在成品入库表扣除数量
            warehousingByTrayExtMapper.updateCountByBoxCode(boxInfoVO.getBoxPackingQuantity(),boxInfoVO.getBarcode());
            //在储位箱子表减去箱子
            baseDepotToCaseExtMapper.deleteByBoxCode(trayNo);
            //在储位物料表减少物料数量
            baseDepotToMatterExtMapper.updateCount(boxInfoVO.getBoxPackingQuantity(),boxInfoVO.getProductCode());
            //添加到出库记录表
            warehousingOutRecord.setMaterialNo(boxInfoVO.getProductCode());
            //从成品入库表查询信息
            WarehousingByTray warehousingByTray= warehousingByTrayExtMapper.selectInfoByTrayCode(boxInfoVO.getBarcode());
            warehousingOutRecord.setMaterialName(warehousingByTray.getMaterialName());
            warehousingOutRecord.setSupplierNo(warehousingByTray.getSignatureCode());
            warehousingOutRecord.setSupplierName(warehousingByTray.getSupplierName());
            warehousingOutRecord.setCount(boxInfoVO.getBoxPackingQuantity());
            warehousingOutRecordMapper.insertSelective(warehousingOutRecord);
        }
        int trayCount=warehousingByTrayExtMapper.selectByTrayNo(trayNo);
        if (trayCount>0){
            //扫托盘
            //扫托盘查看成品信息
            ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity(urlConfig.getMesOrderUrl(), entity, String.class);
            String response = stringResponseEntity.getBody();
            JSONObject jsonObject = JSONObject.parseObject(response);
            JSONObject data = JSONObject.parseObject(jsonObject.getString("data"));
            ProductVO productVO=JSONObject.toJavaObject(data,ProductVO.class);
            //从成品入库表查询信息
            WarehousingByTray warehousingByTray= warehousingByTrayExtMapper.selectInfoByTrayCode(trayNo);
            cougnyTransferOrderProduct.setTrayNo(trayNo);
            cougnyTransferOrderProduct.setCaseNum(warehousingByTray.getTrayBoxQuantity());
            cougnyTransferOrderProduct.setMaterialNo(warehousingByTray.getProductCode());
            cougnyTransferOrderProduct.setMaterialName(warehousingByTray.getMaterialName());
            cougnyTransferOrderProduct.setOutWarehouseCod(warehousingByTray.getStorageNo());
            BaseDepotManagementExample baseDepotManagementExample = new BaseDepotManagementExample();
            BaseDepotManagementExample.Criteria criteria = baseDepotManagementExample.createCriteria();
            criteria.andStorageLocationCodEqualTo(warehousingByTray.getStorageNo());
            List<BaseDepotManagement> baseDepotManagements = baseDepotManagementMapper.selectByExample(baseDepotManagementExample);
            cougnyTransferOrderProduct.setOutWarehouseName(baseDepotManagements.get(0).getStorageLocationName());
            cougnyTransferOrderProduct.setShipmentNo(productOutBoundDTO.getOutOrderCode());
            cougnyTransferOrderProduct.setCustomerNo(cougnyTransferOrderProduct.getCustomerNo());
            cougnyTransferOrderProduct.setCustomerName(cougnyTransferOrderProduct.getCustomerName());
            cougnyTransferOrderProduct.setCustomerMaterialNumber(cougnyTransferOrderProduct.getCustomerMaterialNumber());
            cougnyTransferOrderProduct.setProductUnit(cougnyTransferOrderProduct.getProductUnit());
            cougnyTransferOrderProductMapper.insertSelective(cougnyTransferOrderProduct);
            List<BoxInfoVO> list = productVO.getList();
            for (BoxInfoVO boxInfoVO : list) {
                baseDepotToCaseExtMapper.deleteByBoxCode(boxInfoVO.getBoxBarcode());
            }
            baseDepotToMatterExtMapper.updateCount(warehousingByTray.getTrayQuantity(),warehousingByTray.getProductCode());
            //添加到出库记录表
            warehousingOutRecord.setMaterialName(warehousingByTray.getMaterialName());
            warehousingOutRecord.setSupplierNo(warehousingByTray.getSignatureCode());
            warehousingOutRecord.setSupplierName(warehousingByTray.getSupplierName());
            warehousingOutRecord.setCount(warehousingByTray.getTrayQuantity());
            warehousingOutRecordMapper.insertSelective(warehousingOutRecord);
        }
        return ResultUtil.success();
    }

    @Override
    public ResultVO BoxOrTray(String code) {
        int caseCount=baseDepotToCaseExtMapper.selectByCaseNo(code);
        if (caseCount>0){
            //扫描的是箱子
            TrayInfoVO trayInfoVO=baseDepotToCaseExtMapper.selectInfoByCaseNo(code);
        }
        int trayCount=warehousingByTrayExtMapper.selectByTrayNo(code);
        if (trayCount>0){
            //扫描的是托盘
        }
        return null;
    }

    @Override
    public ResultVO outOrderDetail(String shipmentNo) {
        List<TrayInfoVO> trayInfoVOS=outBoundSaleShipmentExtMapper.selectInfoByNo(shipmentNo);
        return ResultUtil.success(trayInfoVOS);
    }
}
