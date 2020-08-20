package com.bpm.gd.wms.outbound.server.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bpm.gd.wms.outbound.common.util.ResultUtil;
import com.bpm.gd.wms.outbound.common.vo.PageInfoVO;
import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.domain.*;
import com.bpm.gd.wms.outbound.server.dto.MaterialOutBoundDTO;
import com.bpm.gd.wms.outbound.server.dto.OrderBody;
import com.bpm.gd.wms.outbound.server.dto.OrderHead;
import com.bpm.gd.wms.outbound.server.dto.QueryWorkOderWebDTO;
import com.bpm.gd.wms.outbound.server.mapper.base.*;
import com.bpm.gd.wms.outbound.server.mapper.ext.BaseDepotToMatterExtMapper;
import com.bpm.gd.wms.outbound.server.mapper.ext.BaseStorekeeperLineExtMapper;
import com.bpm.gd.wms.outbound.server.mapper.ext.HvGdWorkBomExtMapper;
import com.bpm.gd.wms.outbound.server.mapper.ext.HvPmWorkOrderExtMapper;
import com.bpm.gd.wms.outbound.server.service.ProductionPreparationService;
import com.bpm.gd.wms.outbound.server.util.CheckObjectIsEmpty;
import com.bpm.gd.wms.outbound.server.vo.WorkOrderMaterialDetailVO;
import com.bpm.gd.wms.outbound.server.vo.WorkOrderMaterialVO;
import com.bpm.gd.wms.outbound.server.vo.WorkOrderVO;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 生产备料Service
 */
@Service
@PropertySource("classpath:application-dev.yml")//读取application-dev.yml文件
@Transactional(rollbackFor = Exception.class)
public class ProductionPreparationServiceImpl implements ProductionPreparationService {

    @Resource
    private HvPmWorkOrderMapper hvPmWorkOrderMapper;
    @Resource
    private HvPmWorkOrderExtMapper hvPmWorkOrderExtMapper;
    @Resource
    private HvGdWorkBomExtMapper hvGdWorkBomExtMapper;
    @Resource
    private BaseStorekeeperLineExtMapper baseStorekeeperLineExtMapper;
    @Resource
    private WarehousingOutRecordMapper warehousingOutRecordMapper;
    @Resource
    private HvGdWorkBomMapper hvGdWorkBomMapper;
    @Resource
    private StorageRemainMaterialMapper storageRemainMaterialMapper;
    @Resource
    private WarehousingReceiptDetailsPackMapper warehousingReceiptDetailsPackMapper;
    @Resource
    private BaseDepotToMatterMapper baseDepotToMatterMapper;
    @Resource
    private BaseDepotToMatterExtMapper baseDepotToMatterExtMapper;
    @Resource
    private BaseDepotToCaseMapper baseDepotToCaseMapper;
    @Resource
    private SysUserMapper sysUserMapper;
    @Value("${url}")
    private String url;

    @Override
    public ResultVO selectWorkOrderListByUserId(Integer userId) {
        List<HvPmWorkOrder> oList = hvPmWorkOrderExtMapper.selectWorkOrderListByUserId(userId);
        List<WorkOrderVO> list = new ArrayList<>();
        for(HvPmWorkOrder o : oList){
            WorkOrderVO vo = new WorkOrderVO();
            BeanUtils.copyProperties(o,vo);
            list.add(vo);
        }
        return ResultUtil.success(list);
    }



    /**
     * 根据工单ID和用户ID查询物料信息以及推荐流利架储位
     * @param workOrderId
     * @return
     */
    @Override
    public ResultVO selectOrderMaterialListByWorkOrderId(Integer workOrderId, Integer userId) {
        //初始化返回对象
        List<WorkOrderMaterialVO> resultList = new ArrayList<>();

        //根据工单ID查询工单信息
        HvPmWorkOrder order = hvPmWorkOrderMapper.selectByPrimaryKey(workOrderId);
        if(CheckObjectIsEmpty.checkStringIsNull(order)){
            return ResultUtil.error("未查到此工单信息，请核实后重试！");
        }

        int states=3;
        if(states==order.getWorkOrderState()){
            return ResultUtil.error("此工单已完成拣料！");
        }

        //根据用户ID和产线CODE查询库管员负责的产线及区域
        List<BaseStorekeeperLine> stoList = baseStorekeeperLineExtMapper.selectByUserIdAndLineCode(userId,order.getAreaCode());
        if(stoList.size()>0){
            //区域信息
            BaseStorekeeperLine sto = stoList.get(0);
            //根据工单ID查询该工单的物料清单信息
            List<HvGdWorkBom> bomList = hvGdWorkBomExtMapper.selectByWorkOrderId(workOrderId);

            //根据物料、供应商以查询物料在哪些储位
            for(HvGdWorkBom m : bomList){
                //1.根据物料、供应商、区域查询物料是放在哪些储位
                List<BaseDepotToCase> cases = hvGdWorkBomExtMapper.selectByMaterialCodeAndEigenvalueAndAreaCode(m.getMaterialItemNo(),m.getEigenvalue(),sto.getRegion());
                if(cases.size()==0){
                    //在库房中未查到该物料
                    continue;
                }
                BaseDepotToCase dCase = cases.get(0);
                //组装数据
                WorkOrderMaterialVO vo = new WorkOrderMaterialVO();
                BeanUtils.copyProperties(m,vo);
                vo.setStorageCode(dCase.getDepotId());
                vo.setStorageName(this.getStorageName(dCase.getDepotId()));
                resultList.add(vo);
            }
            //对resultList的储位号进行排序
          //  resultList.sort((x,y)->x.getStorageCode().compareTo(y.getStorageCode()));
        }

        return ResultUtil.success(resultList);
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
        return str;
    }



    /**
     * 扫描小包装或箱子上的序列号
     * @param boxCode
     * @return
     */
    @Override
    public ResultVO scanBoxCode(String boxCode, Integer workOrderId) {
        //初始化一个对象
        WorkOrderMaterialDetailVO vo = new WorkOrderMaterialDetailVO();
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

        //根据工单、物料编号查询工单的物料清单信息
        HvGdWorkBom material = hvGdWorkBomExtMapper.selectByWorkOrderIdAndMaterialCode(workOrderId,materialCode);
        if(CheckObjectIsEmpty.checkStringIsNull(material)){
            return ResultUtil.error("未查询到工单的物料清单信息！");
        }
        //根据物料号、供应商编号查询物料是否被冻结
         WarehousingFrozen warehousingFrozens=hvGdWorkBomExtMapper.selectWarehousingFrozens(material.getMaterialNo(),material.getEigenvalue());
         if(!CheckObjectIsEmpty.checkStringIsNull(warehousingFrozens)){
             return ResultUtil.error("该物料已被冻结，禁止扫描！");
         }

        if(null==material){
            return ResultUtil.error("该工单没有该物料！");
        }

        if(!CheckObjectIsEmpty.checkStringIsNull(material.getReceiveState())){
            if(material.getReceiveState()==1){
                return ResultUtil.error("该物料已拣货完毕，禁止扫描!");
            }
        }

        //判断已发数量是否大于应发数量
        if(material.getSendQuantity().compareTo(material.getIssuedQuantity())>-1){
            return ResultUtil.error("该物料已拣货完毕，禁止扫描!");
        }

        BeanUtils.copyProperties(material,vo);
        vo.setWorkOrderId(workOrderId);
        //判断已发数量是否为空
        if(vo.getSendQuantity()==null){
            vo.setSendQuantity(new BigDecimal(0));
        }

        //根据供应商编码查询供应商信息
       BaseSupplierInformation baseSupplierInformation=hvGdWorkBomExtMapper.selectBySupplierCode(material.getEigenvalue());

        //需拣数量=应发数量-已发数量
        vo.setNeedQuantity(vo.getIssuedQuantity().subtract(vo.getSendQuantity()));
        if(arr.length==6){//判断为箱子
            vo.setType(0);
            //根据箱子序列号查询储位信息（相当于箱子的编码）
            List<BaseDepotToCase> caseList = hvGdWorkBomExtMapper.selectByCaseNo(boxCode);
            if(caseList.size()==0){
                return ResultUtil.error("未查询此箱子储位信息，请核实后在重试！");
            }
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
        }else{
            //判断为小包装
            vo.setType(1);
            //根据内包装序号查询料箱信息
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
     * 提交扫描的物料
     * @param workOrderId 工单ID
     * @param boxCode 扫描的序列号
     * @param type 序列号类型（0：外包装，1：内包装，2：余料）
     * @param strorageCode 储位编号
     * @param userId 用户ID
     * @param accurateQuantity 精准拣货数量
     * @return
     */
    @Override
    public ResultVO submitOutBoundMaterial(Integer workOrderId, String boxCode, Integer type, String strorageCode, Integer userId, BigDecimal accurateQuantity) {
        boolean flag = true;
        String msg = "";
        String[] arr = boxCode.split("#");
        //物料编号
        String materialCode = arr[0];
        //供应商编号
        String supplierCode = arr[1];

        //根据工单、物料编号查询工单的物料清单信息
        HvGdWorkBom material = hvGdWorkBomExtMapper.selectByWorkOrderIdAndMaterialCode(workOrderId,materialCode);
        if(material.getReceiveState()!=null){
            if(material.getReceiveState()==1){
                msg="拣货完毕，禁止扫描提交！";
                return ResultUtil.error(msg);
            }
        }

        if(material.getSendQuantity()==null){
            material.setSendQuantity(new BigDecimal(0));
        }
        //需拣数量=应发数量-已发数量
        BigDecimal needQuantity = material.getIssuedQuantity().subtract(material.getSendQuantity());
        if (needQuantity.compareTo(new BigDecimal(0))<=0) {
            //当需求数量小于等于0时，禁止扫描提交
            msg="拣货完毕，禁止扫描提交！";
            return ResultUtil.error(msg);
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
            //判断该箱子的物料数量是否比需拣物料数量大
            //需拣数量比箱子真实存放数量小
            if(needQuantity.compareTo(depotToCase.getRealNumber())<0){
                //判断该箱子的最小包装的物料数量是否比需求物料数量大
                List<WarehousingReceiptDetailsPack> packs = hvGdWorkBomExtMapper.selectPackByBoxNo(boxCode);
                if(packs.size()>0){
                    WarehousingReceiptDetailsPack pack = packs.get(0);
                    //当箱子中的物料减去需要拣的物料的数量还比小包装的物料数量小，则需要扫描该箱子的小包装
                        //(箱子真实存放数量-需拣数量)-最小包装数量==-1
                        if(depotToCase.getRealNumber().subtract(needQuantity).compareTo(pack.getMaterialNumberQua())<=0){
                            flag = false;
                            msg = "请扫描小包装！";
                            return ResultUtil.error(msg);
                        }
                }
            }
            if(accurateQuantity.compareTo(needQuantity)<0){
                if(accurateQuantity.compareTo(depotToCase.getRealNumber())>0){
                    flag = false;
                    msg = "拣货数量不能大于箱子真实存放数！";
                    return ResultUtil.error(msg);
                }
            }else {
                if(needQuantity.compareTo(depotToCase.getRealNumber())>0){
                    flag = false;
                    msg = "拣货数量不能大于箱子真实存放数！";
                    return ResultUtil.error(msg);
                }
            }

            //查询储位
            BaseDepotToMatter matter = baseDepotToMatterExtMapper.selectByDepotId(strorageCode,material.getMaterialItemNo());
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
                record.setMaterialNo(material.getMaterialItemNo());
                record.setMaterialName(material.getMaterialNo());
                record.setSupplierNo(material.getEigenvalue());
                record.setWarehousingOutType("1");
                record.setStorageNo(strorageCode);
                record.setWarehousingOutTime(new Date());
                record.setBoxNo(boxCode);

                //判断精拣数量小于需拣数量
                if(accurateQuantity.compareTo(needQuantity)<0){
                    record.setCount(accurateQuantity);
                }else {
                    record.setCount(depotToCase.getRealNumber());
                }

                record.setUnit(material.getUnit());
                record.setOrderNo(material.getWorkOrderCode());
                record.setStatus("0");
                record.setOperatorId(userId.longValue());
                warehousingOutRecordMapper.insert(record);
                //2.增加物料清单中的出库数量
                //判断精拣数量小于需拣数量
                if(accurateQuantity.compareTo(needQuantity)<0){
                    material.setSendQuantity(material.getSendQuantity().add(accurateQuantity));
                }else {

                    material.setSendQuantity(material.getSendQuantity().add(depotToCase.getRealNumber()));
                }

                //已发数量大于应发数量
                if(material.getSendQuantity().compareTo(material.getIssuedQuantity())>=0){
                    material.setReceiveState(1);
                    material.setConfirmTime(new Date());
                }
                hvGdWorkBomMapper.updateByPrimaryKeySelective(material);

                 //库存数量=库存数量-箱子真实存放数量
                //判断精拣数量小于需拣数量
                if(accurateQuantity.compareTo(needQuantity)<0){
                    //3.扣减储位物料数量
                    matter.setAllNumber(matter.getAllNumber().subtract(accurateQuantity));
                    //当储位数量为0时删除储位
                    if(matter.getAllNumber().compareTo(new BigDecimal(0))<=0){
                        baseDepotToMatterMapper.deleteByPrimaryKey(matter.getId());
                    }else {
                        baseDepotToMatterMapper.updateByPrimaryKeySelective(matter);
                    }

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
            //判断精拣数量小于需拣数量
            if(accurateQuantity.compareTo(pack.getMaterialNumberQua())!=0) {
                return ResultUtil.error("请输入单个最小包装总数量 !");
            }

            //查询储位
            BaseDepotToMatter matter = baseDepotToMatterExtMapper.selectByDepotId(strorageCode,material.getMaterialItemNo());
            if(CheckObjectIsEmpty.checkStringIsNull(matter)){
                return ResultUtil.error("未查询到小包装储位信息，请核实后重试！");
            }
            if(accurateQuantity.compareTo(matter.getAllNumber())>0){
                return ResultUtil.error("拣货数量不能大于储位总数量！");
            }

            //1.向出库记录表中新增出库记录
            WarehousingOutRecord record = new WarehousingOutRecord();
            record.setMaterialNo(material.getMaterialItemNo());
            record.setMaterialName(material.getMaterialNo());
            record.setSupplierNo(material.getEigenvalue());
            record.setWarehousingOutType("1");
            record.setStorageNo(strorageCode);
            record.setWarehousingOutTime(new Date());
            record.setBoxNo(boxCode);
            record.setOperatorId(userId.longValue());
             record.setCount(pack.getMaterialNumberQua());
            record.setUnit(material.getUnit());
            record.setOrderNo(material.getWorkOrderCode());
            record.setStatus("0");
            warehousingOutRecordMapper.insert(record);

            //2.增加物料清单的出库量
             material.setSendQuantity(material.getSendQuantity().add(pack.getMaterialNumberQua()));
            if(material.getSendQuantity().compareTo(material.getIssuedQuantity())>=0){
                material.setReceiveState(1);
            }
            hvGdWorkBomMapper.updateByPrimaryKeySelective(material);

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
            if(dc.getRealNumber().compareTo(new BigDecimal(0))<=0){
                baseDepotToCaseMapper.deleteByPrimaryKey(dc.getId());
            }else {
                baseDepotToCaseMapper.updateRealNumberByCaseNo(boxCode,dc.getRealNumber().subtract(pack.getMaterialNumberQua()));
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
                return ResultUtil.error("拣料数量不能大于或小于余料数量 !");
            }

           //查询储位
            BaseDepotToMatter matter = baseDepotToMatterExtMapper.selectByDepotId(strorageCode,material.getMaterialItemNo());
            if(CheckObjectIsEmpty.checkStringIsNull(matter)){
                return ResultUtil.error("未查询到余料储位信息，请核实后重试！");
            }
            if(accurateQuantity.compareTo(matter.getAllNumber())>0){
                return ResultUtil.error("拣货数量不能大于储位总数量！");
            }

            //1.向出库记录表中新增出库记录
            WarehousingOutRecord record = new WarehousingOutRecord();
            record.setMaterialNo(material.getMaterialItemNo());
            record.setMaterialName(material.getMaterialNo());
            record.setSupplierNo(material.getEigenvalue());
            record.setWarehousingOutType("1");
            record.setStorageNo(strorageCode);
            record.setWarehousingOutTime(new Date());
            record.setBoxNo(boxCode);
            record.setCount(remain.getQuantity());
            record.setUnit(material.getUnit());
            record.setOrderNo(material.getWorkOrderCode());
            record.setStatus("0");
            record.setOperatorId(userId.longValue());
            warehousingOutRecordMapper.insert(record);
            //2.增加物料清单的出库量
            material.setSendQuantity(material.getSendQuantity().add(remain.getQuantity()));

            if(material.getSendQuantity().compareTo(material.getIssuedQuantity())>=0){
                material.setReceiveState(1);
            }
            hvGdWorkBomMapper.updateByPrimaryKeySelective(material);

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
            //修改工单状态为捡料中
            HvPmWorkOrder workOrder= hvPmWorkOrderMapper.selectByPrimaryKey(workOrderId);
            if(CheckObjectIsEmpty.checkStringIsNull(workOrder)){
                //事务回滚异常
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ResultUtil.error("未查询补料工单信息,请核实后重试！");
            }
            if(workOrder.getWorkOrderState()!=2){
                workOrder.setWorkOrderState(2);
                hvPmWorkOrderMapper.updateByPrimaryKeySelective(workOrder);
            }
            return ResultUtil.success("提交成功");
        }else{
            return ResultUtil.error(msg);
        }

    }



    /**
     * 向T100提交出库
     * @param workOrderId
     * @param userId
     * @return
     */
    @Override
    public ResultVO submitOutBound(Integer workOrderId, Integer userId) {
        //查询工单信息
        HvPmWorkOrder workOrder = hvPmWorkOrderMapper.selectByPrimaryKey(workOrderId);
        if(CheckObjectIsEmpty.checkStringIsNull(workOrder)){
            return ResultUtil.error("未查询到加工清单信息，请确认后重试！");
        }
        MaterialOutBoundDTO materialOutBoundDTO=new MaterialOutBoundDTO();
        //根据工单ID和用户ID查询未提交的出库记录
        List<WarehousingOutRecord>  list = hvGdWorkBomExtMapper.selectOutRecordByWorkOrderIdAndUserId(workOrderId,userId);

        //组装数据
        //根据userid查询角色信息
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId.longValue());
        if(CheckObjectIsEmpty.checkStringIsNull(sysUser)){
           return ResultUtil.error("未查询到当前登录角色信息，请确认后重试！");
        }

        //添加单头数据
        OrderHead orderHead=new OrderHead();
        orderHead.setWorkOrderCode(workOrder.getWorkOrderCode())
                .setApplyUserCode(sysUser.getAccount())
                .setCreateTime(new Date())
                .setManagementUser(workOrder.getManagementUser())
                .setShiftName(workOrder.getShiftName())
                .setAreaCode(workOrder.getAreaCode())
                .setRemarks(workOrder.getRemarks())
                .setProductionBatch(workOrder.getProductionBatch());
        materialOutBoundDTO.setOrderHead(orderHead);
        //添加单身数据
        List<OrderBody> orderBodies=new ArrayList<>();
        if(list.size()>0){
            for (WarehousingOutRecord warehousing : list) {
                //根据物料编码、加工清单查询工单物料清单
                HvGdWorkBom hvGdWorkBom = hvGdWorkBomExtMapper.selectByWorkOrderIdAndMaterialCode(workOrderId, warehousing.getMaterialNo());
                if(CheckObjectIsEmpty.checkStringIsNull(hvGdWorkBom)){
                  return ResultUtil.error("未查询到《"+warehousing.getMaterialNo()+"》物料编码的工单物料清单，请进行确认后提交！");
                }
                OrderBody orderBody=new OrderBody();
                orderBody.setWorkOrderCode(workOrder.getWorkOrderCode())
                        .setMaterialItemNo(warehousing.getMaterialNo())
                        .setEigenvalue(workOrder.getEigenvalue())
                        .setUnit(workOrder.getWorkUnit())
                        .setIssuedQuantity(hvGdWorkBom.getIssuedQuantity())
                        .setSendQuantity(hvGdWorkBom.getSendQuantity());
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
        if(hvGdWorkBomExtMapper.selectByWorkOrderId(workOrderId).size()==0){
            workOrder.setWorkOrderState(3);
            hvPmWorkOrderMapper.updateByPrimaryKeySelective(workOrder);
        }

        return ResultUtil.success("提交成功");
    }

    /**
     * 查询工单列表信息（WEB端）
     * @param workOrderCode
     * @param state
     * @param lineCode
     * @return
     */
    @Override
    public ResultVO selectWorkOrderList(String workOrderCode, Integer state, String lineCode) {
        return null;
    }


    /**
     * 查询所有工单信息
     * @param queryWorkOderWebDTO
     * @return
     */
    @Override
    public ResultVO selectWorkOrderListAll(QueryWorkOderWebDTO queryWorkOderWebDTO) {
        PageHelper.startPage(queryWorkOderWebDTO.getPageNum(),queryWorkOderWebDTO.getPageSize());
        List<HvPmWorkOrder>hvPmWorkOrderList=hvPmWorkOrderExtMapper.selectWorkOrderListAll(queryWorkOderWebDTO.getWorkOrderCodeId(),queryWorkOderWebDTO.getWorkOrderState(),queryWorkOderWebDTO.getAreaCode());
        PageInfo<HvPmWorkOrder> hvGdWorkBomPageInfo = new PageInfo<>(hvPmWorkOrderList);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(hvGdWorkBomPageInfo,pageInfoVO);
        pageInfoVO.setData(hvGdWorkBomPageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }

    /**
     * 根据工单号查询工单物料信息
     * @param queryWorkOderWebDTO
     * @return
     */
    @Override
    public ResultVO selectWorkBomByWorkOrderId(QueryWorkOderWebDTO queryWorkOderWebDTO) {
        PageHelper.startPage(queryWorkOderWebDTO.getPageNum(),queryWorkOderWebDTO.getPageSize());
        List<HvGdWorkBom> hvGdWorkBoms = hvGdWorkBomExtMapper.selectListByWorkOrderId(queryWorkOderWebDTO.getWorkOrderCodeId());
        if(hvGdWorkBoms.size()>0){
            PageInfo<HvGdWorkBom> hvGdWorkBomPageInfo = new PageInfo<>(hvGdWorkBoms);
            PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
            BeanUtils.copyProperties(hvGdWorkBomPageInfo,pageInfoVO);
            pageInfoVO.setData(hvGdWorkBomPageInfo.getList());
            return ResultUtil.success (pageInfoVO);
        }
        return ResultUtil.success(hvGdWorkBoms);
    }

}
