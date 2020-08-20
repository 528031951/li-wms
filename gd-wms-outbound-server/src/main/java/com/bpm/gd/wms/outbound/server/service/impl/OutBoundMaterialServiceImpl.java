package com.bpm.gd.wms.outbound.server.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bpm.gd.wms.outbound.common.util.ResultUtil;
import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.configration.UrlConfig;
import com.bpm.gd.wms.outbound.server.domain.BaseHighLevelRack;
import com.bpm.gd.wms.outbound.server.dto.MaterialOutBoundDTO;
import com.bpm.gd.wms.outbound.server.dto.OrderBody;
import com.bpm.gd.wms.outbound.server.dto.OrderHead;
import com.bpm.gd.wms.outbound.server.gddomain.GDMaterialOrderBody;
import com.bpm.gd.wms.outbound.server.gddomain.GDMaterialOrderHead;
import com.bpm.gd.wms.outbound.server.gddomain.GDMaterialStdData;
import com.bpm.gd.wms.outbound.server.mapper.ext.BaseHighLevelRackExtMapper;
import com.bpm.gd.wms.outbound.server.service.OutBoundMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author Super Young
 * @Date 2020/8/5 15:34
 */
@Service
public class OutBoundMaterialServiceImpl implements OutBoundMaterialService {

    @Autowired
    private UrlConfig urlConfig;

    @Autowired
    private BaseHighLevelRackExtMapper baseHighLevelRackExtMapper;


    @Override
    public ResultVO outBound(MaterialOutBoundDTO materialOutBoundDTO,String status,String orderType) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);

        OrderHead orderHead = materialOutBoundDTO.getOrderHead();
        List<OrderBody> orderBodyList = materialOutBoundDTO.getList();
        GDMaterialOrderHead gdMaterialOrderHead = new GDMaterialOrderHead();
        List<GDMaterialOrderBody> gdMaterialOrderBodys = new ArrayList<>();
        //单头
        //企业编号
        gdMaterialOrderHead.setSfdaent(100);
        //营业据点
        gdMaterialOrderHead.setSfdasite("GD");
        //单据日期
        gdMaterialOrderHead.setSfdadocdt(""+orderHead.getCreateTime());
        //发料类别
        gdMaterialOrderHead.setSfda002(status);
        //申请人
        gdMaterialOrderHead.setSfda004(orderHead.getApplyUserCode());
        //发送http请求到srm
        HttpEntity<String> entity2 = new HttpEntity<String>(orderHead.getApplyUserCode(), headers);
        ResponseEntity<String> responseEntity1 = restTemplate.postForEntity(urlConfig.getSrmUserUrl()+"/queryDepartByCode", entity2, String.class);
        //生产部门
        gdMaterialOrderHead.setSfda003(responseEntity1.getBody());
        //来源单号
        gdMaterialOrderHead.setSfda014(orderHead.getWorkOrderCode());
        //来源类型
        gdMaterialOrderHead.setSfda015("09");
        //单据拥有者
        gdMaterialOrderHead.setSfdaownid(orderHead.getManagementUser());
        //单据拥有部门
        HttpEntity<String> entity3 = new HttpEntity<String>(orderHead.getManagementUser(), headers);
        ResponseEntity<String> responseEntity2 = restTemplate.postForEntity(urlConfig.getSrmUserUrl()+"/queryDepartByCode", entity3, String.class);
        gdMaterialOrderHead.setSfdaowndp(responseEntity2.getBody());
        //单据创建者
        gdMaterialOrderHead.setSfda004(orderHead.getApplyUserCode());
        //单据创建部门
        gdMaterialOrderHead.setSfda003(responseEntity1.getBody());
        //单据创建日期
        gdMaterialOrderHead.setSfdacrtdt(""+orderHead.getCreateTime());
        //单据修改者
        gdMaterialOrderHead.setSfdamodid(orderHead.getApplyUserCode());
        //单据修改日
        gdMaterialOrderHead.setSfdamoddt(""+orderHead.getCreateTime());
        //
        gdMaterialOrderHead.setSfdaud001("0");
        //工单单号
        gdMaterialOrderHead.setSfdb001(orderHead.getWorkOrderCode());
        //runid
        gdMaterialOrderHead.setSfdb002("0");
        //正负 发料-1 退料1
        gdMaterialOrderHead.setSfdb008(orderType);
        //班别
        gdMaterialOrderHead.setSfdbud001(orderHead.getShiftName());
        //产线
        gdMaterialOrderHead.setSfdbud002(orderHead.getAreaCode());
        //备注
        gdMaterialOrderHead.setSfdbud003(orderHead.getRemarks());
        //生产批号
        gdMaterialOrderHead.setSfdbud004(orderHead.getProductionBatch());
        //料废否 Y/N
        if ("23".equals(status)){
            gdMaterialOrderHead.setMaterialwaste("Y");
        }else{
            gdMaterialOrderHead.setMaterialwaste("N");
        }

        //单身集合
        for (OrderBody orderBody : orderBodyList) {
            //单身
            GDMaterialOrderBody gdMaterialOrderBody = new GDMaterialOrderBody();
            gdMaterialOrderBody.setSfdcseq("");//项次
            gdMaterialOrderBody.setSfdc002("");//工单项次
            gdMaterialOrderBody.setSfdc003("1");//工单项序
            //工单号
            gdMaterialOrderBody.setSfdc001(orderHead.getWorkOrderCode());
            //需求料号
            gdMaterialOrderBody.setSfdc004(orderBody.getMaterialItemNo());
            //产品特征
            gdMaterialOrderBody.setSfdc005(orderBody.getEigenvalue());
            //单位
            gdMaterialOrderBody.setSfdc006(orderBody.getUnit());
            //申请数量
            gdMaterialOrderBody.setSfdc007(""+orderBody.getIssuedQuantity());
            //实际数量
            gdMaterialOrderBody.setSfdc008(""+orderBody.getSendQuantity());
            //参考单位
            gdMaterialOrderBody.setSfdc009(orderBody.getUnit());
            //参考单位需求数量
            gdMaterialOrderBody.setSfdc010(""+orderBody.getIssuedQuantity());
            //参考单位实际数量
            gdMaterialOrderBody.setSfdc011(""+orderBody.getSendQuantity());
            //指定库位
            gdMaterialOrderBody.setSfdc012("1");
            //指定储位
            List<BaseHighLevelRack> list=baseHighLevelRackExtMapper.selectByMaterialNo(orderBody.getMaterialItemNo());
            if (list.isEmpty()){
                gdMaterialOrderBody.setSfdc013("1");
            }else{
                gdMaterialOrderBody.setSfdc013(list.get(0).getStorageLocationCod());
            }
            //指定批号
            gdMaterialOrderBody.setSfdc014(orderHead.getProductionBatch());
            //理由码
            if ("23".equals(status)){
                //料废
                gdMaterialOrderBody.setSfdc015("D0002");
            }else if ("25".equals(status)){
                //工废
                gdMaterialOrderBody.setSfdc015("D0001");
            }else{
                gdMaterialOrderBody.setSfdc015("");
            }
            //库存管理特征
            gdMaterialOrderBody.setSfdc016(orderBody.getEigenvalue());
            //正负 退料1 发料-1
            gdMaterialOrderBody.setSfdc017(orderType);
            //客供料否 Y/N
            gdMaterialOrderBody.setSfde009("Y");
            gdMaterialOrderBodys.add(gdMaterialOrderBody);
        }

        //发送http请求到T100
        JSONObject jsonObject = this.outBoundUtil(gdMaterialOrderHead,gdMaterialOrderBodys);
        HttpEntity<String> entity1 = new HttpEntity<String>(jsonObject.toJSONString(), headers);
        System.out.println(jsonObject.toJSONString());
        try {
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(urlConfig.getUrl(), entity1, String.class);
            System.out.println(responseEntity.getBody());
            return ResultUtil.success();
        } catch (RestClientException e) {
            e.printStackTrace();
            return ResultUtil.error("回传T100失败");
        }
    }

    public JSONObject outBoundUtil(GDMaterialOrderHead head, List<GDMaterialOrderBody> bodys) {
        JSONObject jsonObject = new JSONObject();
        //datakey
        HashMap<String, String> datakey = new HashMap<>();
        datakey.put("EntId","100");
        datakey.put("CompanyId","GD");
        //host
        HashMap<String, String> host = new HashMap<>();
        host.put("appmodule","A011");
        host.put("prod","APP");
        host.put("lang","zh_CN");
        host.put("acct","11096");
        host.put("ip","192.168.0.229");
        host.put("timestamp","3527360109224935C:F9:DD:40:AE:085cf9dd40ae089096B006170920141521");
        //service
        HashMap<String, String> service = new HashMap<>();
        service.put("name","Mesdispatchget");
        service.put("id","toptst");
        service.put("prod","T100");
        service.put("ip","192.168.0.230");
        //payload
        JSONObject payload = new JSONObject();
        GDMaterialStdData stdData = new GDMaterialStdData();
        stdData.setParameter(head);
        HashMap<String,List<GDMaterialOrderBody>> data=new HashMap<>();
        data.put("data",bodys);
        stdData.setParam(data);
        payload.put("std_data",stdData);
        //往json加数据
        jsonObject.put("payload",payload);
        jsonObject.put("service",service);
        jsonObject.put("host",host);
        jsonObject.put("datakey",datakey);
        jsonObject.put("type","sync");
        jsonObject.put("key","D402A32BCAE986232EB52A36933A4B9B");
        return jsonObject;
    }
}
