package com.bpm.gd.wms.outbound.server.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bpm.gd.wms.outbound.common.util.ResultUtil;
import com.bpm.gd.wms.outbound.common.vo.PageInfoVO;
import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.domain.*;
import com.bpm.gd.wms.outbound.server.dto.*;
import com.bpm.gd.wms.outbound.server.mapper.base.*;
import com.bpm.gd.wms.outbound.server.mapper.ext.BaseDepotToMatterExtMapper;
import com.bpm.gd.wms.outbound.server.mapper.ext.HvGdWorkBomExtMapper;
import com.bpm.gd.wms.outbound.server.mapper.ext.HvPmWorkOrderExtMapper;
import com.bpm.gd.wms.outbound.server.mapper.ext.WorkOrderMaterialSupplementExtMapper;
import com.bpm.gd.wms.outbound.server.service.MaterialSupplementService;
import com.bpm.gd.wms.outbound.server.util.CheckObjectIsEmpty;
import com.bpm.gd.wms.outbound.server.vo.WorkOrderMaterialSupplementDetailsVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

/**
 * 工单补料Service
 */
@Service
@PropertySource("classpath:application-dev.yml")//读取application-dev.yml文件
@Transactional(rollbackFor = Exception.class)
public class MaterialSupplementServiceImpl implements MaterialSupplementService {

    @Resource
    private HvGdMaterialWasteMapper hvGdMaterialWasteMapper;
    @Resource
    private HvPmWorkOrderExtMapper hvPmWorkOrderExtMapper;
    @Resource
    private BaseDepotToMatterExtMapper baseDepotToMatterExtMapper;
    @Resource
    private WorkOrderMaterialSupplementMapper workOrderMaterialSupplementMapper;
    @Resource
    private WorkOrderMaterialSupplementDetailsMapper workOrderMaterialSupplementDetailsMapper;
    @Resource
    private HvGdWorkBomExtMapper hvGdWorkBomExtMapper;
    @Resource
    private WarehousingOutRecordMapper warehousingOutRecordMapper;
    @Resource
    private BaseDepotToMatterMapper baseDepotToMatterMapper;
    @Resource
    private WarehousingReceiptDetailsPackMapper warehousingReceiptDetailsPackMapper;
    @Resource
    private StorageRemainMaterialMapper storageRemainMaterialMapper;
    @Resource
    private BaseDepotToCaseMapper baseDepotToCaseMapper;
    @Resource
    private WorkOrderMaterialSupplementExtMapper workOrderMaterialSupplementExtMapper;
    @Resource
    private SysUserMapper sysUserMapper;
    @Value("${url}")
    private String url;

    @Override
    public ResultVO receiveMaterialWasteList(List<MaterialWasteDTO> list) {
        if(list.size()>0){

            //查询工单信息
            HvPmWorkOrder order = hvPmWorkOrderExtMapper.selectByWorkOrderCode(list.get(0).getWorkOrderCode());
            //料废信息
            List<HvGdMaterialWaste> wList = new ArrayList<>();
            //工单补料物料信息
            Map<String,List<WorkOrderMaterialSupplementDetails>> map = new HashMap<>();
            //工单补料头信息
            WorkOrderMaterialSupplement ms = new WorkOrderMaterialSupplement();
            String supplementCode = System.currentTimeMillis()+"";
            Date applicationDate = new Date();
            ms.setSupplementCode(supplementCode);
            ms.setLineCode(order.getAreaCode());
            ms.setApplicationTime(applicationDate);
            ms.setPlanEndTime(order.getPlanEndTime());
            ms.setPlanStartTime(order.getPlanStartTime());
            ms.setStatus(0);
            ms.setWorkOrderCode(order.getWorkOrderCode());
            ms.setProductCode(order.getMaterialCode());
            ms.setProductName(order.getMaterialName());

            for(MaterialWasteDTO dto : list){
                //组装料废信息
                HvGdMaterialWaste w = new HvGdMaterialWaste();
                BeanUtils.copyProperties(dto,w);
                w.setWorkOrderId(order.getId());
                w.setStatus(0);
                wList.add(w);
                //若需求数量等于0，则不需要补料,大于0,需要补料
                if(dto.getNeedNumber().compareTo(new BigDecimal(0))==1){
                    //组装工单补料物料详情信息
                    WorkOrderMaterialSupplementDetails detail = new WorkOrderMaterialSupplementDetails();
                    BeanUtils.copyProperties(dto,detail);
                    detail.setStatus(0);
                    detail.setSupplementCode(supplementCode);
                    //根据物料和供应商查询所处区域
                    List<String> depotIdList =baseDepotToMatterExtMapper.selectDepotIdBySupplierCodeAndMatterId(dto.getEigenvalue(),dto.getMaterielCode());
                    if(depotIdList.size()>0){
                        String depotId = depotIdList.get(0).substring(0,3);
                        if(map.get(depotId)==null){
                            List<WorkOrderMaterialSupplementDetails> tempList = new ArrayList<>();
                            tempList.add(detail);
                            map.put(depotId,tempList);
                        }else{
                            List<WorkOrderMaterialSupplementDetails> tempList2 =  map.get(depotId);
                            boolean flag = false;
                            for(WorkOrderMaterialSupplementDetails d : tempList2){
                                //如果同一个区域的List中有相同的物料，则需要的数量累加
                                if(d.getMaterielCode().equals(detail.getMaterielCode())){
                                    flag = true;
                                    d.setNeedNumber(d.getNeedNumber().add(detail.getNeedNumber()));
                                }
                            }
                            if(flag){
                                tempList2.add(detail);
                            }
                            map.put(depotId,tempList2);
                        }
                    }else{
                        //仓库没有该物料
                    }
                }

            }

            //保存料废信息
            for(HvGdMaterialWaste hmw : wList){
                hvGdMaterialWasteMapper.insert(hmw);
            }
            //保存工单补料信息
            for(String key : map.keySet()){
                List<WorkOrderMaterialSupplementDetails> tempList = map.get(key);
                ms.setAreaCode(key);
                workOrderMaterialSupplementMapper.insert(ms);
                for(WorkOrderMaterialSupplementDetails d : tempList){
                    workOrderMaterialSupplementDetailsMapper.insert(d);
                }
            }

        }

        return ResultUtil.success("success");

    }

    /**
     * 根据用户ID查询工单信息
     * @param userId
     * @return
     */
    @Override
    public ResultVO selectWorkOrderListByUserId(Integer userId) {
        List<WorkOrderMaterialSupplement> oList = workOrderMaterialSupplementMapper.selectByUserId(userId);
        return ResultUtil.success(oList);
    }

    /**
     * 根据补料单号查询物料信息以及推荐流利架储位
     * @param supplementCode
     * @return
     */
    @Override
    public ResultVO selectMaterialListBySupplementCode(String supplementCode) {
        //根据补料单号查询工单补料单信息
        WorkOrderMaterialSupplement wms = workOrderMaterialSupplementMapper.selectBySupplementCode(supplementCode);
        if(CheckObjectIsEmpty.checkStringIsNull(wms)){
            return ResultUtil.error("未查询到《"+supplementCode+"》补料工单信息");
        }
        int status=2;
        if(status==wms.getStatus()){
            return ResultUtil.error("该补料工单已完成，请勿重复扫描");
        }

        List<WorkOrderMaterialSupplementDetailsVO> list = workOrderMaterialSupplementDetailsMapper.selectBySupplementCode(supplementCode);
        //判断补料工单下是否有物料清单信息
        if(list.size()>0){
            for(WorkOrderMaterialSupplementDetailsVO dd : list){
                //1.根据物料、供应商、区域查询物料是放在哪些储位
                List<BaseDepotToCase> cases = hvGdWorkBomExtMapper.selectByMaterialCodeAndEigenvalueAndAreaCode(dd.getMaterielCode(),dd.getEigenvalue(),wms.getAreaCode());
                if(cases.size()==0){
                    //在库房中未查到该物料
                    continue;
                }
                BaseDepotToCase dCase = cases.get(0);
                dd.setStorageCode(dCase.getDepotId());
                dd.setStorageName(this.getStorageName(dCase.getDepotId()));
            }
        }
        return ResultUtil.success(list);
    }

    @Override
    public ResultVO scanBoxCode(String boxCode, String supplementCode) {
        boolean flag = true;
        String msg = "";
        //根据扫描的条码判断为到底是小包装序列号还是箱子序列号
        String[] arr = boxCode.split("#");
        //物料编号
        String materialCode = arr[0];
        //供应商编号
        String supplierCode = arr[1];
        String arrCode="";

        if(arr.length>6){
            if(arr[6].indexOf("S")!=-1){
                arrCode="外";
            }else {
                arrCode="内";
            }
        }else {
            arrCode="内";
        }

        //根据补料单号、物料编号查询补料单的物料清单信息
        WorkOrderMaterialSupplementDetailsVO vo = workOrderMaterialSupplementDetailsMapper.selectBySupplementCodeAndMaterialCode(supplementCode,materialCode);
        //        HvGdWorkBom material = hvGdWorkBomExtMapper.selectByWorkOrderIdAndMaterialCode(workOrderId,materialCode);

        if(CheckObjectIsEmpty.checkStringIsNull(vo)){
            return ResultUtil.error("未查询到补料单的物料清单信息！");
        }
        //根据物料号、供应商编号查询物料是否被冻结
        WarehousingFrozen warehousingFrozens=hvGdWorkBomExtMapper.selectWarehousingFrozens(vo.getMaterielCode(),vo.getEigenvalue());
        if(!CheckObjectIsEmpty.checkStringIsNull(warehousingFrozens)){
            return ResultUtil.error("该物料已被冻结，禁止扫描！");
        }

        if(null==vo){
            msg="该工单的补料信息中没有该物料！";
            return ResultUtil.error(msg);
        }
        if(vo.getStatus()==1){
            msg="该物料已拣货完毕，禁止扫描!";
            return ResultUtil.error(msg);
        }

        //根据供应商编码查询供应商信息
        BaseSupplierInformation baseSupplierInformation=hvGdWorkBomExtMapper.selectBySupplierCode(vo.getEigenvalue());
        if(CheckObjectIsEmpty.checkStringIsNull(baseSupplierInformation)){
            msg="未查询到此物料供应商信息！";
            return ResultUtil.error(msg);
        }

        if(arr.length==6){//判断为箱子
            vo.setType(0);
            //根据箱子序列号查询储位信息
            List<BaseDepotToCase> caseList = hvGdWorkBomExtMapper.selectByCaseNo(boxCode);
            if(caseList.size()>0){
                BaseDepotToCase depotToCase = caseList.get(0);
                //查询该储位是否有余料，若有余料提示先扫余料的小包装
                List<StorageRemainMaterial> remainList = hvGdWorkBomExtMapper.selectRemainMaterialByStorageCode(depotToCase.getDepotId());
                if(remainList.size()>0){
                    //有余料，请先扫描余料
                    flag = false;
                    msg = "该储位有余料，请先扫描余料";
                }else{
                    vo.setStorageCode(depotToCase.getDepotId());
                    vo.setStorageName(getStorageName(depotToCase.getDepotId()));
                    vo.setQuantity(depotToCase.getRealNumber());
                    vo.setSupplierName(baseSupplierInformation.getSupplierName());
                    vo.setSupplierType(baseSupplierInformation.getProperty());
                    vo.setCaseNumber(arr[4]+arrCode);
                    vo.setBatchNumber(arr[3]);
                    vo.setCaseNo(depotToCase.getCaseNo());
                }
            }
        }else{//判断为小包装
            vo.setType(1);
            //根据内包装序号查询储位信息
            List<BaseDepotToCase> caseList = hvGdWorkBomExtMapper.selectDepotByPackNo(boxCode);
            if(caseList.size()>0){
                //判断为箱子的小包装，但不为余料
                BaseDepotToCase depotToCase = caseList.get(0);
                //查询该储位是否有余料，若有余料提示先扫余料的小包装
                List<StorageRemainMaterial> remainList = hvGdWorkBomExtMapper.selectRemainMaterialByStorageCode(depotToCase.getDepotId());
                if(remainList.size()>0){
                    //有余料，请先扫描余料
                    flag = false;
                    msg = "该储位有余料，请先扫描余料";
                }else{
                    //无余料，扫描通过，组装数据
                    vo.setStorageCode(depotToCase.getDepotId());
                    vo.setStorageName(getStorageName(depotToCase.getDepotId()));
                    //根据小包装序号查询小包装的信息
                    WarehousingReceiptDetailsPack pack = hvGdWorkBomExtMapper.selectPackByPackNo(boxCode);
                    vo.setQuantity(pack.getMaterialNumberNotqua());
                    vo.setSupplierName(baseSupplierInformation.getSupplierName());
                    vo.setSupplierType(baseSupplierInformation.getProperty());
                    vo.setCaseNumber(arr[4]+arrCode);
                    vo.setBatchNumber(arr[3]);
                    vo.setCaseNo(depotToCase.getCaseNo());
                }

            }else{
                //小包装没查到料箱，判断是否为余料
                List<StorageRemainMaterial> remainList = hvGdWorkBomExtMapper.selectRemainMaterialByBoxCode(boxCode);
                if(remainList.size()>0){
                    //判断为余料
                    vo.setType(2);
                    vo.setStorageCode(remainList.get(0).getStorageLocationCode());
                    vo.setStorageName(getStorageName(remainList.get(0).getStorageLocationCode()));
                    vo.setQuantity(remainList.get(0).getQuantity());
                    vo.setSupplierName(baseSupplierInformation.getSupplierName());
                    vo.setSupplierType(baseSupplierInformation.getProperty());
                    vo.setCaseNumber(arr[4]+arrCode);
                    vo.setBatchNumber(arr[3]);
                }else{
                    //没查到该物料，禁止出货，重新扫描！
                    flag = false;
                    msg = "没查到该物料，禁止出货，请重新扫描！";
                }
            }
        }
        if(flag){
            return ResultUtil.success(vo);
        }else{
            return ResultUtil.error(msg);
        }
    }

    /**
     * 根据储位编号组装储位名称
     * @param storageCode
     * @return
     */
    private String getStorageName(String storageCode){
        char[] arr = storageCode.toCharArray();
        String str = "";
        for(int i = 0;i<arr.length;i++){
            if(i==0){
                str = String.valueOf(arr[i]);
            }else if(i==3||i==6){
                str=str+"-"+String.valueOf(arr[i]);
            }else if(i==4||i==7){
                str=str+String.valueOf(arr[i]);
            }else{
                str=str+"-"+String.valueOf(arr[i]);
            }
        }
        System.out.println(str);
        return str;
    }

    /**
     * 提交扫描的物料
     * @param supplementCode 补料单号
     * @param boxCode 扫描的序列号
     * @param type 序列号类型（0：外包装，1：内包装，2：余料）
     * @param storageCode 储位编号
     * @param userId 用户ID
     * @param accurateQuantity 精准拣料数量
     * @return
     */
    @Override
    public ResultVO submitSupplementMaterial(String supplementCode, String boxCode, Integer type, String storageCode, Integer userId, BigDecimal accurateQuantity) {
        boolean flag = true;
        String msg = "";
        String[] arr = boxCode.split("#");
        //物料编号
        String materialCode = arr[0];
        //供应商编号
        String supplierCode = arr[1];

        //根据补料单号、物料编号查询补料单的物料清单信息
        WorkOrderMaterialSupplementDetailsVO vo = workOrderMaterialSupplementDetailsMapper.selectBySupplementCodeAndMaterialCode(supplementCode,materialCode);
        //根据单号查询补料单信息
        WorkOrderMaterialSupplement  woS = workOrderMaterialSupplementMapper.selectBySupplementCode(supplementCode);

        //需拣数量=应发数量-已发数量
        BigDecimal needQuantity = vo.getNeedNumber().subtract(vo.getSendNumber());
        if (vo.getStatus()==1) {
            //当需求数量小于等于0时，禁止扫描提交
            msg="拣货完毕，禁止扫描提交！";
            return ResultUtil.error(msg);
        }
        if(woS.getStatus()!=null){
            if(woS.getStatus()==2){
                msg="此补料工单已完成，禁止扫描提交！";
                return ResultUtil.error(msg);
            }
        }

        //判断精准拣货数量是否大于需拣数量
        if(needQuantity.compareTo(accurateQuantity)<0){
            msg="精准拣货数量不可大于待拣数量！";
            return ResultUtil.error(msg);
        }


        //根据类型查询扫描的物料信息
        if(type==0){
            //查询物料信息
            List<BaseDepotToCase> caseList = hvGdWorkBomExtMapper.selectByCaseNo(boxCode);
            if(caseList.size()==0){
                return ResultUtil.error("未查询到物料信息");
            }

            BaseDepotToCase depotToCase = caseList.get(0);
            //判断该箱子的物料数量是否比需求物料数量大
            if(depotToCase.getRealNumber().compareTo(vo.getNeedNumber())>0){
                //判断该箱子的最小包装的物料数量是否比需求物料数量大
                List<WarehousingReceiptDetailsPack> packs = hvGdWorkBomExtMapper.selectPackByBoxNo(boxCode);
                if(packs.size()>0){
                    WarehousingReceiptDetailsPack pack = packs.get(0);
                    //当箱子中的物料减去需要拣的物料的数量还比小包装的物料数量小，则需要扫描该箱子的小包装
                    if(depotToCase.getRealNumber().subtract(vo.getNeedNumber()).compareTo(pack.getMaterialNumberQua())<0){
                        flag = false;
                        msg = "请扫描小包装！";
                    }
                }
            }

            if(accurateQuantity.compareTo(needQuantity)<0){
                if(accurateQuantity.compareTo(depotToCase.getRealNumber())>0){
                    flag = false;
                    msg = "拣货数量不能大于箱子真实存放数！";
                }
            }else {
                if(needQuantity.compareTo(depotToCase.getRealNumber())>0){
                    flag = false;
                    msg = "拣货数量不能大于箱子真实存放数！";
                }
            }

            //查询储位
            BaseDepotToMatter matter = baseDepotToMatterExtMapper.selectByDepotId(storageCode,vo.getMaterielCode());
            if(CheckObjectIsEmpty.checkStringIsNull(matter)){
                return ResultUtil.error("未查询到箱子储位信息，请核实后重试！");
            }
            if(accurateQuantity.compareTo(matter.getAllNumber())>0){
                return ResultUtil.error("拣货数量不能大于储位总数量！");
            }

            if(flag){
                //不需要重新扫描小包装，则生成出库记录，增加物料清单的出库量，并删除储位上的箱子信息
                //1.向出库记录表中新增出库记录
                WarehousingOutRecord record = new WarehousingOutRecord();
                record.setMaterialNo(vo.getMaterielCode());
                record.setMaterialName(vo.getMaterielName());
                record.setSupplierNo(vo.getEigenvalue());
                record.setWarehousingOutType("2");
                record.setStorageNo(storageCode);
                record.setWarehousingOutTime(new Date());
                record.setBoxNo(boxCode);

                //精检数量小于需拣数量
                if(accurateQuantity.compareTo(vo.getNeedNumber())<0){
                    record.setCount(accurateQuantity);
                }else {
                    record.setCount(depotToCase.getRealNumber());
                }

                record.setUnit(vo.getMaterielUnit());
                record.setOrderNo(vo.getWorkOrderCode());
                record.setStatus("0");
                record.setOperatorId(userId.longValue());
                warehousingOutRecordMapper.insert(record);
                //2.增加补料清单中的出库数量
                //精检数量小于需拣数量
                if(accurateQuantity.compareTo(vo.getNeedNumber())<0){
                    vo.setSendNumber(vo.getSendNumber().add(accurateQuantity));
                }else {
                    vo.setSendNumber(vo.getSendNumber().add(depotToCase.getRealNumber()));
                }
                //已发数量大于应发数量
                if(vo.getSendNumber().compareTo(vo.getNeedNumber())>=0){
                    vo.setStatus(1);

                }
                WorkOrderMaterialSupplementDetails details = new WorkOrderMaterialSupplementDetails();
                BeanUtils.copyProperties(vo,details);
                workOrderMaterialSupplementDetailsMapper.updateByPrimaryKeySelective(details);
                //修改补料单状态为进行中
                if(woS.getStatus()==0){
                    woS.setStatus(1);
                    workOrderMaterialSupplementMapper.updateByPrimaryKeySelective(woS);
                }

                //精检数量小于需拣数量
                if(accurateQuantity.compareTo(vo.getNeedNumber())<0){
                    //3.扣减储位物料数量
                    matter.setAllNumber(matter.getAllNumber().subtract(accurateQuantity));
                    //当储位数量为0时删除储位
                    if(matter.getAllNumber().compareTo(new BigDecimal(0))<=0){
                        baseDepotToMatterMapper.deleteByPrimaryKey(matter.getId());
                    }else {
                        baseDepotToMatterMapper.updateByPrimaryKeySelective(matter);
                    }
                    //修改储为上箱子信息
                    //根据箱子序列号查询储位上箱子信息
                    List<BaseDepotToCase> baseDepotToCaseList=hvGdWorkBomExtMapper.findBaseDepotToCase(boxCode);
                    //修改储位上箱子信息
                    if(baseDepotToCaseList.size()>0){
                        BaseDepotToCase baseDepotToCase = baseDepotToCaseList.get(0);
                        if(baseDepotToCase.getRealNumber().compareTo(accurateQuantity)==0){
                            //4.删除储位上的箱子信息
                            hvGdWorkBomExtMapper.deleteDepotByBoxNo(boxCode);
                            //5.将箱子对应的小包装标记为出库
                            warehousingReceiptDetailsPackMapper.updateIsBoundByBoxNo(boxCode);
                        }else {
                            baseDepotToCase.setRealNumber(baseDepotToCase.getRealNumber().subtract(accurateQuantity));
                            baseDepotToCaseMapper.updateByPrimaryKeySelective(baseDepotToCase);
                        }
                    }
                }else {
                    //3.扣减储位物料数量
                    matter.setAllNumber(matter.getAllNumber().subtract(depotToCase.getRealNumber()));
                    //当储位数量为0时删除储位
                    if(matter.getAllNumber().compareTo(new BigDecimal(0))<=0){
                        baseDepotToMatterMapper.deleteByPrimaryKey(matter.getId());
                    }else {
                        baseDepotToMatterMapper.updateByPrimaryKeySelective(matter);
                    }

                    //4.删除储位上的箱子信息
                    hvGdWorkBomExtMapper.deleteDepotByBoxNo(boxCode);
                    //5.将箱子对应的小包装标记为出库
                    warehousingReceiptDetailsPackMapper.updateIsBoundByBoxNo(boxCode);
                }
            }
        }else if(type==1){
            BaseDepotToCase dc = baseDepotToCaseMapper.selectByCaseNo(boxCode);
            if(accurateQuantity.compareTo(needQuantity)<0){
                if(accurateQuantity.compareTo(dc.getRealNumber())>0){
                    flag = false;
                    msg = "拣货数量不能大于箱子真实存放数！";
                    return ResultUtil.error(msg);
                }
            }else {
                if(needQuantity.compareTo(dc.getRealNumber())>0){
                    flag = false;
                    msg = "拣货数量不能大于箱子真实存放数！";
                    return ResultUtil.error(msg);
                }
            }

            //扫描小包装，则不需要判断，生产出库记录，增加物料清单的出库量，并修改小包装表的状态
            WarehousingReceiptDetailsPack pack = hvGdWorkBomExtMapper.selectPackByPackNo(boxCode);
            if(CheckObjectIsEmpty.checkStringIsNull(pack)){
                return ResultUtil.error("未查询到小包装物料信息，请核实后在重试");
            }

            //判断精拣数量小于需拣数量
            if(accurateQuantity.compareTo(pack.getMaterialNumberQua())!=0) {
                return ResultUtil.error("拣料数量不能大于或小于小包装合格数 !");
            }

            //查询储位
            BaseDepotToMatter matter = baseDepotToMatterExtMapper.selectByDepotId(storageCode,vo.getMaterielCode());
            if(CheckObjectIsEmpty.checkStringIsNull(matter)){
                return ResultUtil.error("未查询到小包装储位信息，请核实后重试！");
            }
            if(accurateQuantity.compareTo(matter.getAllNumber())>0){
                return ResultUtil.error("拣货数量不能大于储位总数量！");
            }

            //1.向出库记录表中新增出库记录
            WarehousingOutRecord record = new WarehousingOutRecord();
            record.setMaterialNo(vo.getMaterielCode());
            record.setMaterialName(vo.getMaterielName());
            record.setSupplierNo(vo.getEigenvalue());
            record.setWarehousingOutType("2");
            record.setStorageNo(storageCode);
            record.setWarehousingOutTime(new Date());
            record.setBoxNo(boxCode);
            record.setCount(pack.getMaterialNumberQua());
            record.setUnit(vo.getMaterielUnit());
            record.setOrderNo(vo.getWorkOrderCode());
            record.setStatus("0");
            record.setOperatorId(userId.longValue());
            warehousingOutRecordMapper.insert(record);

            //2.增加物料清单的出库量
            vo.setSendNumber(vo.getSendNumber().add(pack.getMaterialNumberQua()));
            if(vo.getSendNumber().compareTo(vo.getNeedNumber())>=0){
                vo.setStatus(1);
            }
            WorkOrderMaterialSupplementDetails details = new WorkOrderMaterialSupplementDetails();
            BeanUtils.copyProperties(vo,details);
            workOrderMaterialSupplementDetailsMapper.updateByPrimaryKeySelective(details);
            //修改补料单状态为进行中
            if(woS.getStatus()==0){
                woS.setStatus(1);
                workOrderMaterialSupplementMapper.updateByPrimaryKeySelective(woS);
            }
            //3.扣减储位物料数量
            matter.setAllNumber(matter.getAllNumber().subtract(pack.getMaterialNumberQua()));
            //当储位数量为0时删除储位
            if(matter.getAllNumber().compareTo(new BigDecimal(0))<=0){
                baseDepotToMatterMapper.deleteByPrimaryKey(matter.getId());
            }else {
                baseDepotToMatterMapper.updateByPrimaryKeySelective(matter);
            }


            //4.扣减储位上箱子的物料数量
            //箱子真实存放数量小于或等于0则删除箱子
            dc.setRealNumber(dc.getRealNumber().subtract(pack.getMaterialNumberQua()));
            if(dc.getRealNumber().compareTo(new BigDecimal(0))<=0){
                baseDepotToCaseMapper.deleteByPrimaryKey(dc.getId());
            }else {
                baseDepotToCaseMapper.updateRealNumberByCaseNo(boxCode,dc.getRealNumber());
            }
            //5.修改小包装表的状态
            pack.setIsBound(1);
            warehousingReceiptDetailsPackMapper.updateByPrimaryKeySelective(pack);

        }else if(type==2){
            //扫描余料，则不需要判断，生产出库记录，增加物料清单的出库量，并删除储位的余料信息
            List<StorageRemainMaterial> remainList = hvGdWorkBomExtMapper.selectRemainMaterialByBoxCode(boxCode);
            if(remainList.size()==0){
                return ResultUtil.error("未查询到余料信息，请核实后在进行扫描！");
            }

            StorageRemainMaterial remain = remainList.get(0);
            //判断拣料数量是否大于或小于余料数量
            if(accurateQuantity.compareTo(remain.getQuantity())!=0){
                return ResultUtil.error("请输入单个最小包装总数量 !");
            }

            //查询储位
            BaseDepotToMatter matter = baseDepotToMatterExtMapper.selectByDepotId(storageCode,vo.getMaterielCode());
            if(CheckObjectIsEmpty.checkStringIsNull(matter)){
                return ResultUtil.error("未查询到余料储位信息，请核实后重试！");
            }
            if(accurateQuantity.compareTo(matter.getAllNumber())>0){
                return ResultUtil.error("拣货数量不能大于储位总数量！");
            }

            //1.向出库记录表中新增出库记录
            WarehousingOutRecord record = new WarehousingOutRecord();
            record.setMaterialNo(vo.getMaterielCode());
            record.setMaterialName(vo.getMaterielName());
            record.setSupplierNo(vo.getEigenvalue());
            record.setWarehousingOutType("2");
            record.setStorageNo(storageCode);
            record.setWarehousingOutTime(new Date());
            record.setBoxNo(boxCode);
            record.setCount(remain.getQuantity());
            record.setUnit(vo.getMaterielUnit());
            record.setOrderNo(vo.getWorkOrderCode());
            record.setStatus("0");
            record.setOperatorId(userId.longValue());
            warehousingOutRecordMapper.insert(record);
            //2.增加物料清单的出库量
             vo.setSendNumber(vo.getSendNumber().add(remain.getQuantity()));
            if(vo.getSendNumber().compareTo(vo.getNeedNumber())>=0){
                vo.setStatus(1);
            }
            WorkOrderMaterialSupplementDetails details = new WorkOrderMaterialSupplementDetails();
            BeanUtils.copyProperties(vo,details);
            workOrderMaterialSupplementDetailsMapper.updateByPrimaryKeySelective(details);
            //修改补料单状态为进行中
            if(woS.getStatus()==0){
                woS.setStatus(1);
                workOrderMaterialSupplementMapper.updateByPrimaryKeySelective(woS);
            }

            //3.扣减储位物料数量
            matter.setAllNumber(matter.getAllNumber().subtract(remain.getQuantity()));
            //当储位数量为0时删除储位
            if(matter.getAllNumber().compareTo(new BigDecimal(0))<=0){
                baseDepotToMatterMapper.deleteByPrimaryKey(matter.getId());
            }else {
                baseDepotToMatterMapper.updateByPrimaryKeySelective(matter);
            }

            //4.删除储位的余料信息
            storageRemainMaterialMapper.deleteByBoxCode(boxCode);
        }

        if(flag){
            //修改补料单状态为捡料中
            WorkOrderMaterialSupplement workOrder= workOrderMaterialSupplementMapper.selectBySupplementCode(supplementCode);
            if(CheckObjectIsEmpty.checkStringIsNull(workOrder)){
                //事务回滚异常
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ResultUtil.error("未查询补料工单信息,请核实后重试！");
            }
            if(workOrder.getStatus()==0){
                workOrder.setStatus(1);
                workOrderMaterialSupplementMapper.updateByPrimaryKeySelective(workOrder);
            }
            //调用T100上传方法
            this.uploadT100(workOrder);
            return ResultUtil.success("提交成功");
        }else{
            return ResultUtil.error(msg);
        }
    }



    /**
     * 向T100上传补料信息
     * @param wms
     */
    private void uploadT100(WorkOrderMaterialSupplement wms){
        //根据工单编号查询所有的补料单信息
        HvPmWorkOrder order = hvPmWorkOrderExtMapper.selectByWorkOrderCode(wms.getWorkOrderCode());
        int num = workOrderMaterialSupplementDetailsMapper.selectNotFinishedCountByWorkOrderCode(wms.getWorkOrderCode());
        //当该工单所有物料都补料完毕，调用T100接口
        if(num==0){
            //查询出所有未上传的料废信息
            List<HvGdMaterialWaste> list = hvGdMaterialWasteMapper.selectByWorkOrderCode(wms.getWorkOrderCode());


        }


    }


    /**
     * 根据扫描的批次号，查询物料信息
     * @param workOrderCode
     * @param scanValue
     * @return
     */
    @Override
    public BigDecimal selectMaterialInfoByScanvalue(String workOrderCode, String scanValue) {
        BigDecimal result = new BigDecimal(0);
        String[] arr = workOrderCode.split("#");
        //先查询出库记录表，箱子、余料必然会查到（出库的时候扫描的小包装能够查到），只有部分小包装查不到（是出库的时候整箱出，
        // 但是产线MES收货时是按小包装进行收货的， 这个时候是查不到的，就必须查询小包装表）
        List<WarehousingOutRecord> list = warehousingOutRecordMapper.selectByWorkOrderCodeAndBoxNo(workOrderCode,scanValue);
        if(list.size()>0){
            result = list.get(0).getCount();
        }else{
            //查询箱子下的小包装表
            result = warehousingReceiptDetailsPackMapper.selectMaterialNumberQuaByPackNo(scanValue);
        }
        return result;
    }

    /**
     * 条件查询所有补料工单信息
     * @param queryWorkOderWebDTO
     * @return
     */
    @Override
    public ResultVO selectWorkOrderMaterialSupplementAll(QueryWorkOderWebDTO queryWorkOderWebDTO) {
        PageHelper.startPage(queryWorkOderWebDTO.getPageNum(),queryWorkOderWebDTO.getPageSize());
        List<WorkOrderMaterialSupplement> workOrderMaterialSupplements = workOrderMaterialSupplementExtMapper.selectWorkOrderMaterialSupplementAll(queryWorkOderWebDTO.getWorkOrderCodeId(), queryWorkOderWebDTO.getWorkOrderState(), queryWorkOderWebDTO.getAreaCode());
        PageInfo<WorkOrderMaterialSupplement> hvGdWorkBomPageInfo = new PageInfo<>(workOrderMaterialSupplements);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(hvGdWorkBomPageInfo,pageInfoVO);
        pageInfoVO.setData(hvGdWorkBomPageInfo.getList());
        return ResultUtil.success(pageInfoVO);

    }

    /**
     * 根据补料工单号查询补料工单物料信息
     * @param queryWorkOderWebDTO  补料工单号
     * @return
     */
    @Override
    public ResultVO selectWorkOrderMaterialSupplementByWorkOrderId(QueryWorkOderWebDTO queryWorkOderWebDTO) {
        PageHelper.startPage(queryWorkOderWebDTO.getPageNum(),queryWorkOderWebDTO.getPageSize());
        List<WorkOrderMaterialSupplementDetailsVO> vo = workOrderMaterialSupplementExtMapper.selectListByWorkOrderCodeId(queryWorkOderWebDTO.getWorkOrderCodeId());
        PageInfo<WorkOrderMaterialSupplementDetailsVO> hvGdWorkBomPageInfo = new PageInfo<>(vo);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(hvGdWorkBomPageInfo,pageInfoVO);
        pageInfoVO.setData(hvGdWorkBomPageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }

    /**
     * 向T100提交补料出库
     * @param workOrderId  补料工单id
     * @param userId  用户id
     * @return
     */
    @Override
    public ResultVO submitOutBound(Integer workOrderId, Integer userId) {
        //查询补料工单信息
        WorkOrderMaterialSupplement workOrderMaterialSupplement = workOrderMaterialSupplementMapper.selectByPrimaryKey(workOrderId);
        //根据补料工单信息查询加工清单信息
        HvPmWorkOrder hvPmWorkOrder = hvGdWorkBomExtMapper.selectByWorkOrderCode(workOrderMaterialSupplement.getWorkOrderCode());


        if(CheckObjectIsEmpty.checkStringIsNull(workOrderMaterialSupplement)){
            return ResultUtil.error("未查询到补料信息，请确认后重试！");
        }

        MaterialOutBoundDTO materialOutBoundDTO=new MaterialOutBoundDTO();
        //根据工单ID和用户ID查询未提交的出库记录
        List<WarehousingOutRecord>  list = hvGdWorkBomExtMapper.selectOutRecordByWorkOrderIdAndUserId(workOrderId,userId);

        //组装数据
        //根据userid查询角色信息
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId.longValue());
        if(CheckObjectIsEmpty.checkStringIsNull(sysUser)){
          return  ResultUtil.error("未查询到当前登录角色信息，请确认后重试！");
        }

        //添加单头数据
        OrderHead orderHead=new OrderHead();
        orderHead.setWorkOrderCode(workOrderMaterialSupplement.getSupplementCode())
                .setApplyUserCode(sysUser.getAccount())
                .setCreateTime(new Date())
                .setManagementUser(hvPmWorkOrder.getManagementUser())
                .setShiftName(hvPmWorkOrder.getShiftName())
                .setAreaCode(workOrderMaterialSupplement.getLineCode())
                .setRemarks(hvPmWorkOrder.getRemarks())
                .setProductionBatch(hvPmWorkOrder.getProductionBatch());
        materialOutBoundDTO.setOrderHead(orderHead);
        //添加单身数据
        List<OrderBody> orderBodies=new ArrayList<>();
        if(list.size()>0){
            for (WarehousingOutRecord warehousing : list) {
                //根据补料编码、物料编码查询补料物料清单
                WorkOrderMaterialSupplementDetails workOrderMaterialSupplementDetails = workOrderMaterialSupplementDetailsMapper.selectByWorkOrderCode(workOrderMaterialSupplement.getSupplementCode(), warehousing.getMaterialNo());
                if(CheckObjectIsEmpty.checkStringIsNull(workOrderMaterialSupplementDetails)){
                    return ResultUtil.error("未查询到《"+warehousing.getMaterialNo()+"》物料编码的工单物料清单，请进行确认后提交！");
                }
                OrderBody orderBody=new OrderBody();
                orderBody.setWorkOrderCode(workOrderMaterialSupplement.getSupplementCode())
                        .setMaterialItemNo(warehousing.getMaterialNo())
                        .setEigenvalue(hvPmWorkOrder.getEigenvalue())
                        .setUnit(hvPmWorkOrder.getWorkUnit())
                        .setIssuedQuantity(workOrderMaterialSupplementDetails.getNeedNumber())
                        .setSendQuantity(workOrderMaterialSupplementDetails.getSendNumber());
                orderBodies.add(orderBody);
            }
        }else {
            return ResultUtil.error("目前没有可出库数据！");
        }
        materialOutBoundDTO.setList(orderBodies);

        //将出库后的数据传向T100
        String wmsMaterial = JSONObject.toJSONString(materialOutBoundDTO);
        //发送请求给给T100
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        HttpEntity<String> entity1 = new HttpEntity<String>(wmsMaterial, headers);
        String code="200";
        try {
            ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity(url, entity1, String.class);
            String returnCode= String.valueOf(stringResponseEntity.getStatusCode());
            if(!code.equals(returnCode)){
                return ResultUtil.error("上传T100失败，请重试！");
            }
        } catch (RestClientException e) {
            e.printStackTrace();
            return ResultUtil.error("上传T100失败，请重试！");
        }

        //根据工单ID和用户ID修改出库记录为已提交
        hvGdWorkBomExtMapper.updateOutRecordStatusByWorkOrderIdAndUserId(workOrderId,userId);
        //判断物料清单的发料状态若为全部拣货完毕，修改工单状态为捡料完毕
        if(workOrderMaterialSupplementDetailsMapper.selectWorkOrderCode(workOrderMaterialSupplement.getSupplementCode()).size()==0){
            workOrderMaterialSupplement.setStatus(2);
            workOrderMaterialSupplementMapper.updateByPrimaryKeySelective(workOrderMaterialSupplement);
        }

        return ResultUtil.success("提交成功");
    }

}
