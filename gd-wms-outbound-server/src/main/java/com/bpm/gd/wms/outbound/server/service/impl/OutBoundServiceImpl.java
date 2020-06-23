package com.bpm.gd.wms.outbound.server.service.impl;

import com.bpm.gd.wms.outbound.common.util.ResultUtil;
import com.bpm.gd.wms.outbound.common.vo.PageInfoVO;
import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.domain.*;
import com.bpm.gd.wms.outbound.server.dto.*;
import com.bpm.gd.wms.outbound.server.mapper.ext.*;
import com.bpm.gd.wms.outbound.server.service.OutBoundService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.expression.Ids;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
@Transactional
public class OutBoundServiceImpl implements OutBoundService {

    @Autowired
    private OutBoundWorkOrderExtMapper outBoundWorkOrderExtMapper;


    @Autowired
    private OutBoundFillBillExtMapper outBoundFillBillExtMapper;

    @Autowired
    private OutBoundFillBillTaskExtMapper outBoundFillBillTaskExtMapper;

    @Autowired
    private BaseDepotToMatterExtMapper baseDepotToMatterExtMapper;

    @Autowired
    private BaseDepotToProductExtMapper baseDepotToProductExtMapper;

    @Autowired
    private OutBoundSaleExtMapper outBoundSaleExtMapper;

    /**
     * 分页查询工单
     * @param queryWorkOrderDTO
     * @return
     */
    @Override
    public ResultVO findWorkOrder(QueryWorkOrderDTO queryWorkOrderDTO) {
        // 分页
        PageHelper.startPage(queryWorkOrderDTO.getPageNum(), queryWorkOrderDTO.getPageSize());
        List<OutBoundWorkOrder> queryList = outBoundWorkOrderExtMapper.findWorkOrder(queryWorkOrderDTO);
        PageInfo<OutBoundWorkOrder> pageInfo = new PageInfo<OutBoundWorkOrder>(queryList);
//        // copy数据
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return pageInfoVO;
    }



    /**
     * 查询工单下的物料信息
     * @param workOrderId
     * @return
     */
    @Override
    public ResultVO findWorkOrderMatter(String workOrderId) {
        List<OutBoundWorkOrder> queryList = outBoundWorkOrderExtMapper.findWorkOrderMatter(workOrderId);
        return ResultUtil.success(queryList);
    }






    /**
     * 分页查询补料单
     * @param queryFillBillDTO
     * @return
     */
    @Override
    public ResultVO findFillBill(QueryFillBillDTO queryFillBillDTO) {
        // 分页
        PageHelper.startPage(queryFillBillDTO.getPageNum(), queryFillBillDTO.getPageSize());
        List<OutBoundFillBill> queryList = outBoundFillBillExtMapper.findFillBill(queryFillBillDTO);
        PageInfo<OutBoundFillBill> pageInfo = new PageInfo<OutBoundFillBill>(queryList);
//        // copy数据
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return pageInfoVO;
    }




    /**
     * 查询补料单下的物料信息
     * @param fillBillId
     * @return
     */
    @Override
    public ResultVO findFillBillMatter(String fillBillId) {
        List<OutBoundFillBill> queryList = outBoundFillBillExtMapper.findFillBIllMatter(fillBillId);
        return ResultUtil.success(queryList);
    }

    /**
     * 查询补料单下的物料信息
     * @param depotId
     * @return
     */
    @Override
    public ResultVO findMatterByPosition(String depotId) {
        List<BaseDepotToMatter> queryList = baseDepotToMatterExtMapper.findMatterByPosition(depotId);
        return ResultUtil.success(queryList);
    }
    /**
     * 查询箱子或者小包装数量
     * @param ID
     * @return
     */
    @Override
    public ResultVO scanBoxOrPackage(String ID) {
        int type =0;
        //0表示箱子，1表示小包装，2表示箱子里面包含小包装，前端提示
        if (ID.endsWith("S")){
            type=1;
            String boxID=ID.substring(0,ID.length()-1);
            List<BoxInfo> queryList = baseDepotToMatterExtMapper.scanBoxOrPackage(boxID);
            for (BoxInfo boxInfo : queryList){
                boxInfo.setType(type);
//                map.put("oneNum",Integer.parseInt(map.get("").toString())/Integer.parseInt(map.get("").toString()));
            }
            return ResultUtil.success(queryList);
        }
        List<BoxInfo> queryList = baseDepotToMatterExtMapper.scanBoxOrPackage(ID);
        for (BoxInfo boxInfo : queryList){
            boxInfo.setType(type);
            if (boxInfo.getMinPackageNumber() >0){
                List<BoxInfo> result= new ArrayList<>();
                boxInfo.setType(2);
                result.add(boxInfo);
                return ResultUtil.success(result);
            }
        }
        return ResultUtil.success(queryList);
    }

    /**
     * (成品)查询箱子或者小包装数量
     * @param ID
     * @return
     */
    @Override
    public ResultVO scanBoxOrPackageProduct(String ID) {
        int type =0;
        //0表示箱子，1表示小包装，2表示箱子里面包含小包装，前端提示
        if (ID.endsWith("S")){
            type=1;
            String boxID=ID.substring(0,ID.length()-1);
            List<BoxInfoProduct> queryList = baseDepotToMatterExtMapper.scanBoxOrPackageProduct(boxID);
            for (BoxInfoProduct boxInfoProduct : queryList){
                boxInfoProduct.setType(type);
//                map.put("oneNum",Integer.parseInt(map.get("").toString())/Integer.parseInt(map.get("").toString()));
            }
            return ResultUtil.success(queryList);
        }
        List<BoxInfoProduct> queryList = baseDepotToMatterExtMapper.scanBoxOrPackageProduct(ID);
        for (BoxInfoProduct boxInfoProduct : queryList){
            boxInfoProduct.setType(type);
            if (boxInfoProduct.getMinPackageNumber() >0){
                List<BoxInfoProduct> result= new ArrayList<>();
                boxInfoProduct.setType(2);
                result.add(boxInfoProduct);
                return ResultUtil.success(result);
            }
        }
        return ResultUtil.success(queryList);
    }

    /**
     * 分配的工单任务
     * @param idsDTO
     * @return
     */
    @Override
    public ResultVO dispatchWorkOrder (IdsDTO idsDTO) {
        List<String> ids = idsDTO.getIds();
        return ResultUtil.success(outBoundWorkOrderExtMapper.dispatchWorkOrder(ids));

    }

    /**
     * 查询成品
     * @param queryProductDTO
     * @return
     */
    @Override
    public ResultVO findProduct (QueryProductDTO queryProductDTO) {
        List<BaseDepotToProduct> list=baseDepotToProductExtMapper.findProductMatter(queryProductDTO);
        return ResultUtil.success(list);

    }
    /**
     * 查询成品
     * @param idsDTO
     * @return
     */
    @Override
    public ResultVO findProductById (IdsDTO idsDTO) {
        List<String> ids=idsDTO.getIds();
        List<BaseDepotToProduct> list=baseDepotToProductExtMapper.findProductMatterById(ids);
        return ResultUtil.success(list);

    }


    /**
     *成品出库
     * @param queryList
     * @return
     */
    @Override
    public ResultVO outProduct (List<QueryProductDTO> queryList) {
        List<String> ids=new ArrayList<>();
        for (QueryProductDTO queryProductDTO:queryList){
            ids.add(queryProductDTO.getProductId());
        }
        List<BaseDepotToProduct> list=baseDepotToProductExtMapper.findProductMatterByIdAll(ids);
        List<BaseDepotToProduct> resultList = new ArrayList<BaseDepotToProduct>();
        for (QueryProductDTO queryProductDTO:queryList){
            Long outTotal=queryProductDTO.getOutNumber();
            for (BaseDepotToProduct baseDepotToProduct: list){
                if (baseDepotToProduct.getMatterId().equals(queryProductDTO.getProductId())){
                    Long oneDepotNumber=baseDepotToProduct.getAllNumber()-baseDepotToProduct.getTransferNumber();
                    if (outTotal > oneDepotNumber){
                        baseDepotToProduct.setAddOutNumber(oneDepotNumber);
                        outTotal -=oneDepotNumber;
                        resultList.add(baseDepotToProduct);
                    }else if(outTotal<=oneDepotNumber && outTotal>0){
                        baseDepotToProduct.setAddOutNumber(outTotal);
                        outTotal=0L;
                        resultList.add(baseDepotToProduct);
                    }else{
                        break;
                    }
                }
            }
        }
        return ResultUtil.success(baseDepotToProductExtMapper.outProduct(resultList));

    }

    /**
     * 分配的补料任务
     * @param idsDTO
     * @return
     */
    @Override
    public ResultVO dispatchFillBill (IdsDTO idsDTO) {
        List<String> ids = idsDTO.getIds();
        return ResultUtil.success(outBoundFillBillExtMapper.dispatchFillBill(ids));

    }
    /**
     *查询员工下工单任务
     * @param user
     * @return
     */
    @Override
    @Transactional
    public ResultVO findTaskByUser (String user) {
        List<OutBoundWorkOrder> queryOrderList = outBoundWorkOrderExtMapper.findTaskByUser(user);
        //List<OutBoundFillBill> queryBillList = outBoundFillBillExtMapper.findTaskByUser(user);
//        Map<String,List> map = new HashMap<String,List>();
//        for (OutBoundWorkOrder outBoundWorkOrder :queryOrderList){
//            if (map.get(outBoundWorkOrder.getWorkOrderId()) == null){
//                List <OutBoundWorkOrder> newList = new ArrayList<OutBoundWorkOrder>();
//                newList.add(outBoundWorkOrder);
//                map.put(outBoundWorkOrder.getWorkOrderId(),newList);
//            }
//            else{
//                map.get(outBoundWorkOrder.getWorkOrderId()).add(outBoundWorkOrder);
//            }
//        }
//        List<String> list2 = new ArrayList<String> ();
//        list2.addAll(map.keySet());
//        map.put("idList", list2);
        return ResultUtil.success(queryOrderList);

    }

    /**
     * 查询员工下补料单任务
     * @param user
     * @return
     */
    @Override
    @Transactional
    public ResultVO findBillTaskByUser (String user) {
        List<OutBoundFillBill> queryBillList = outBoundFillBillExtMapper.findTaskByUser(user);
        return ResultUtil.success(queryBillList);

    }





    /**
     * 查询工单下的物料信息
     * @param workOrderId ,name
     * @return
     */
    @Override
    public ResultVO findMatterByWorkOrder (String workOrderId, String name) {
        List<OutBoundWorkOrder> queryOrderList = outBoundWorkOrderExtMapper.findMatterByWorkOrder(workOrderId,name);
        return ResultUtil.success(queryOrderList);

    }

    /**
     * 查询补料单下的物料信息
     * @param fillBillId ,name
     * @return
     */
    @Override
    public ResultVO findMatterByBill (String fillBillId, String name) {
        List<OutBoundFillBill> queryBillList = outBoundFillBillExtMapper.findMatterByBill(fillBillId,name);
        return ResultUtil.success(queryBillList);

    }




    /**
     * 补料单更新拣货状态和数量
     * @param outBoundFillBillTask
     * @return
     */
    @Override
    @Transactional
    public ResultVO outBoundMatterFB(OutBoundFillBillTask outBoundFillBillTask) {
        outBoundFillBillTaskExtMapper.outBoundMatterFB(outBoundFillBillTask);
        baseDepotToMatterExtMapper.updateMatterInfo(outBoundFillBillTask);
        return ResultUtil.success(baseDepotToMatterExtMapper.updateCaseInfo(outBoundFillBillTask));
    }




    /**
     * 查询补料单下物料位置
     * @param fillBillId ,name
     * @return
     */
    @Override
    @Transactional
    public ResultVO findPositionByBill (String fillBillId, String name) {


        //需要添加悲观锁
        List<OutBoundFillBill> queryBillList = outBoundFillBillExtMapper.findPositionByBill(fillBillId,name);
        //需去除高位架物品（规则还未确定）
        List<OutBoundFillBillTask> taskList =outBoundFillBillTaskExtMapper.findTaskByBill(fillBillId,name);
        for (OutBoundFillBill outBoundFillBill:queryBillList){
            for (OutBoundFillBillTask outBoundFillBillTask: taskList){
                if(outBoundFillBillTask.getMatterNo().equals(outBoundFillBill.getMatterNo()) ){
                    //计算位置之前把已经的拣货数量减去
                    outBoundFillBill.setMatterNumber(outBoundFillBill.getMatterNumber()-outBoundFillBillTask.getOutNumber());
                }
            }
        }

            try{

                List<OutBoundFillBill> result=findBestPositionNew(queryBillList);
                for (OutBoundFillBill outBoundFillBill:result) {
                    for (OutBoundFillBillTask outBoundFillBillTask : taskList) {
                        if (outBoundFillBillTask.getMatterNo().equals(outBoundFillBill.getMatterNo())) {
                            //总数加回去
                            outBoundFillBill.setMatterNumber(outBoundFillBill.getMatterNumber() + outBoundFillBillTask.getOutNumber());
                        }
                        if (outBoundFillBillTask.getMatterNo().equals(outBoundFillBill.getMatterNo()) && outBoundFillBillTask.getDepotId().equals(outBoundFillBill.getDepotId())) {
                            //对应位置的总数加回去
                            if (outBoundFillBill.getAddUseNumber() == null) {
                                outBoundFillBill.setAddUseNumber(outBoundFillBillTask.getOutNumber());
                            } else {
                                outBoundFillBill.setAddUseNumber(outBoundFillBill.getAddUseNumber() + outBoundFillBillTask.getOutNumber());
                            }
                            if (outBoundFillBill.getOutNumber() == null) {
                                outBoundFillBill.setOutNumber(outBoundFillBillTask.getOutNumber());
                            } else {
                                outBoundFillBill.setOutNumber(outBoundFillBill.getOutNumber() + outBoundFillBillTask.getOutNumber());
                            }
                        }
                    }
                }
                Map<String,List> map = new HashMap<String,List>();
                for (OutBoundFillBill data:result){
                    String depotId= data.getDepotId();
                    String position = depotId.substring(depotId.length()-6,depotId.length()-5);
                    String number = depotId.substring(depotId.length()-5,depotId.length()-3);
                    data.setPositionNumber(number);
                    if (map.get(position) == null){
                        List <OutBoundFillBill> newList = new ArrayList<OutBoundFillBill>();
                        newList.add(data);
                        map.put(position,newList);
                    }
                    else{
                        map.get(position).add(data);
                    }
                }
                return ResultUtil.success(map);
            }catch(Exception e){
                return ResultUtil.error(e.getMessage());
            }
    }


    private List<OutBoundFillBill> findBestPositionNew(List<OutBoundFillBill> queryList) throws Exception {
        List<String> test = new ArrayList<>();
        Map<String,List> map = new HashMap<String,List>();
        for (OutBoundFillBill outBoundFillBill :queryList){
            if (map.get(outBoundFillBill.getMatterNo()) == null){
                List <OutBoundFillBill> newList = new ArrayList<OutBoundFillBill>();
                newList.add(outBoundFillBill);
                map.put(outBoundFillBill.getMatterNo(),newList);
            }
            else{
                map.get(outBoundFillBill.getMatterNo()).add(outBoundFillBill);
            }
        }
        List <OutBoundFillBill> result = new ArrayList<OutBoundFillBill>();
        for (Map.Entry<String, List> entry : map.entrySet()) {
            List<OutBoundFillBill> info = entry.getValue();
            if (info.size()==1 && (info.get(0).getDepotId()=="" ||info.get(0).getDepotId()==null)){
                throw new Exception("补料单中"+info.get(0).getMatterNo()+"/"+info.get(0).getMatterName()+"物料在库存无剩余！请补充");
            }
            if (info.size()>0 && info.get(0).getDepotId()!="" && info.get(0).getDepotId()!=null){
                List<OutBoundFillBill> retList = new ArrayList<OutBoundFillBill>();
                List<OutBoundFillBill> position = getPositionOneMatterNew(info,info.get(0).getMatterNumber(),retList);
                result.addAll(position);
            }
        }
        return result;
    }

    private List<OutBoundFillBill> getPositionOneMatterNew(List<OutBoundFillBill> list,Long num,List<OutBoundFillBill> retList) throws Exception {
        OutBoundFillBill first = list.get(0);
        Long  freeNum=first.getRealNumber();
        if (freeNum>=num){
            first.setAddUseNumber(num);
            retList.add(first);
            return retList;
        }else {
            if (list.size()==1){
                throw new Exception("库存中："+first.getMatterNo()+"/"+first.getMatterName()+" 的数量小于补料单需求数量！请补充");
            }else{
                first.setAddUseNumber(freeNum);
                retList.add(first);
                list.remove(0);
                return getPositionOneMatterNew(list,num-freeNum,retList);
            }
        }
    }



    /**
     * 工单更新拣货状态和数量
     * @param outBoundFillBillTask
     * @return
     */
    @Override
    @Transactional
    public ResultVO outBoundMatterWO(OutBoundFillBillTask outBoundFillBillTask) {
        outBoundFillBillTaskExtMapper.outBoundMatterWOnew(outBoundFillBillTask);
        //outBoundWorkOrderExtMapper.updateOutNumber(outBoundFillBillTask);
        baseDepotToMatterExtMapper.updateMatterInfo(outBoundFillBillTask);
        return ResultUtil.success(baseDepotToMatterExtMapper.updateCaseInfo(outBoundFillBillTask));
    }

    /**
     * 查询工单下物料位置
     * @param workOrderId ,name
     * @return
     */
    @Override
    @Transactional
    public ResultVO findPositionByWorkOrder (String workOrderId, String name) {
        //需要添加悲观锁
        List<OutBoundWorkOrder> queryBillList = outBoundWorkOrderExtMapper.findPositionByBill(workOrderId,name);
        //需去除高位架物品（规则还未确定）
        List<OutBoundFillBillTask> taskList =outBoundFillBillTaskExtMapper.findTaskByWorkOrder(workOrderId,name);
        for (OutBoundWorkOrder outBoundWorkOrder:queryBillList){
            for (OutBoundFillBillTask outBoundFillBillTask: taskList){
                if(outBoundFillBillTask.getMatterNo().equals(outBoundWorkOrder.getMatterNo()) ){
                    //计算位置之前把已经的拣货数量减去
                    outBoundWorkOrder.setMatterNumber(outBoundWorkOrder.getMatterNumber()-outBoundFillBillTask.getOutNumber());
                }
            }
        }


        try{
            List<OutBoundWorkOrder> result=findBestPositionNewWO(queryBillList);
            for (OutBoundWorkOrder outBoundWorkOrder:result){
                for (OutBoundFillBillTask outBoundFillBillTask: taskList){
                    if(outBoundFillBillTask.getMatterNo().equals(outBoundWorkOrder.getMatterNo()) ){
                        //总数加回去
                        outBoundWorkOrder.setMatterNumber(outBoundWorkOrder.getMatterNumber()+outBoundFillBillTask.getOutNumber());
                    }
                    if(outBoundFillBillTask.getMatterNo().equals(outBoundWorkOrder.getMatterNo())  && outBoundFillBillTask.getDepotId().equals(outBoundWorkOrder.getDepotId())){
                        //对应位置的总数加回去
                        if(outBoundWorkOrder.getAddUseNumber()==null){
                            outBoundWorkOrder.setAddUseNumber(outBoundFillBillTask.getOutNumber());
                        }else{
                            outBoundWorkOrder.setAddUseNumber(outBoundWorkOrder.getAddUseNumber()+outBoundFillBillTask.getOutNumber());
                        }
                        if(outBoundWorkOrder.getOutNumber()==null){
                            outBoundWorkOrder.setOutNumber(outBoundFillBillTask.getOutNumber());
                        }else{
                            outBoundWorkOrder.setOutNumber(outBoundWorkOrder.getOutNumber()+outBoundFillBillTask.getOutNumber());
                        }
                        //对应位置的已拣数加回去

                    }
                }
            }
//                outBoundWorkOrderTaskExtMapper.savePosition(result);
//                baseDepotToMatterExtMapper.updateUseNumberFB(result);
            Map<String,List> map = new HashMap<String,List>();
            for (OutBoundWorkOrder data:result){
                String depotId= data.getDepotId();
                String position = depotId.substring(depotId.length()-6,depotId.length()-5);
                String number = depotId.substring(depotId.length()-5,depotId.length()-3);
                data.setPositionNumber(number);
                if (map.get(position) == null){
                    List <OutBoundWorkOrder> newList = new ArrayList<OutBoundWorkOrder>();
                    newList.add(data);
                    map.put(position,newList);
                }
                else{
                    map.get(position).add(data);
                }
            }
            return ResultUtil.success(map);
        }catch(Exception e){
            return ResultUtil.error(e.getMessage());
        }
    }


    private List<OutBoundWorkOrder> findBestPositionNewWO(List<OutBoundWorkOrder> queryList) throws Exception {
        List<String> test = new ArrayList<>();
        Map<String,List> map = new HashMap<String,List>();
        for (OutBoundWorkOrder outBoundWorkOrder :queryList){
            if (map.get(outBoundWorkOrder.getMatterNo()) == null){
                List <OutBoundWorkOrder> newList = new ArrayList<OutBoundWorkOrder>();
                newList.add(outBoundWorkOrder);
                map.put(outBoundWorkOrder.getMatterNo(),newList);
            }
            else{
                map.get(outBoundWorkOrder.getMatterNo()).add(outBoundWorkOrder);
            }
        }
        List <OutBoundWorkOrder> result = new ArrayList<OutBoundWorkOrder>();
        for (Map.Entry<String, List> entry : map.entrySet()) {
            List<OutBoundWorkOrder> info = entry.getValue();
            if (info.size()==1 && (info.get(0).getDepotId()=="" ||info.get(0).getDepotId()==null)){
                throw new Exception("补料单中"+info.get(0).getMatterNo()+"/"+info.get(0).getMatterName()+"物料在库存无剩余！请补充");
            }
            if (info.size()>0 && info.get(0).getDepotId()!="" && info.get(0).getDepotId()!=null){
                List<OutBoundWorkOrder> retList = new ArrayList<OutBoundWorkOrder>();
                List<OutBoundWorkOrder> position = getPositionOneMatterNewWO(info,info.get(0).getMatterNumber(),retList);
                result.addAll(position);
            }
        }
        return result;
    }

    private List<OutBoundWorkOrder> getPositionOneMatterNewWO(List<OutBoundWorkOrder> list,Long num,List<OutBoundWorkOrder> retList) throws Exception {
        OutBoundWorkOrder first = list.get(0);
        Long  freeNum=first.getRealNumber();
        if (freeNum>=num){
            first.setAddUseNumber(num);
            retList.add(first);
            return retList;
        }else {
            if (list.size()==1){
                throw new Exception("库存中："+first.getMatterNo()+"/"+first.getMatterName()+" 的数量小于补料单需求数量！请补充");
            }else{
                first.setAddUseNumber(freeNum);
                retList.add(first);
                list.remove(0);
                return getPositionOneMatterNewWO(list,num-freeNum,retList);
            }
        }
    }














    /**
     * 查询送货单中物料应该放的位置
     * @param list
     * @return
     */
    @Override
    @Transactional
    public ResultVO sendOrderInBound(List<SendOrder> list) {
        List<SendOrder> resultList = outBoundFillBillTaskExtMapper.InBoundMatterPosition(list);
        return ResultUtil.success(resultList);
    }



    /**
     * 分页查询销售单
     * @param queryBillDTO
     * @return
     */
    @Override
    public ResultVO findSaleInfo(QueryBillDTO queryBillDTO) {
        // 分页
        PageHelper.startPage(queryBillDTO.getPageNum(), queryBillDTO.getPageSize());
        List<OutBoundSale> queryList = outBoundSaleExtMapper.findSaleInfo(queryBillDTO);
        PageInfo<OutBoundSale> pageInfo = new PageInfo<OutBoundSale>(queryList);
//        // copy数据
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return pageInfoVO;
    }

    /**
     * 查询销售单下的物料信息
     * @param saleId
     * @return
     */
    @Override
    public ResultVO findSaleMatter(String saleId) {
        List<OutBoundSale> queryList = outBoundSaleExtMapper.findSaleMatter(saleId);
        return ResultUtil.success(queryList);
    }



    /**
     * 分配的补料任务
     * @param idsDTO
     * @return
     */
    @Override
    public ResultVO dispatchSale (IdsDTO idsDTO) {
        List<String> ids = idsDTO.getIds();
        return ResultUtil.success(outBoundSaleExtMapper.dispatchSale(ids));

    }



    /**
     * 查询员工下（销售单）任务
     * @param user
     * @return
     */
    @Override
    @Transactional
    public ResultVO findSaleTaskByUser (String user) {
        List<OutBoundSale> queryList = outBoundSaleExtMapper.findSaleTaskByUser(user);
        return ResultUtil.success(queryList);

    }

    /**
     * 查询销售单下物料位置
     * @param saleId ,name
     * @return
     */
    @Override
    @Transactional
    public ResultVO findPositionBySale (String saleId, String name) {
        //需要添加悲观锁
        List<OutBoundSaleVO> queryBillList = outBoundSaleExtMapper.findPositionBySale(saleId,name);
        //需去除高位架物品（规则还未确定）
        List<OutBoundFillBillTask> taskList =outBoundFillBillTaskExtMapper.findTaskBySale(saleId,name);
        for (OutBoundSaleVO outBoundSaleVO:queryBillList){
            for (OutBoundFillBillTask outBoundFillBillTask: taskList){
                if(outBoundFillBillTask.getMatterNo().equals(outBoundSaleVO.getMatterNo()) ){
                    //计算位置之前把已经的拣货数量减去
                    outBoundSaleVO.setMatterNumber(outBoundSaleVO.getMatterNumber()-outBoundFillBillTask.getOutNumber());
                }
            }
        }

        try{
            List<OutBoundSaleVO> result=findBestPositionNewSL(queryBillList);
            for (OutBoundSaleVO outBoundSaleVO:result){
                for (OutBoundFillBillTask outBoundFillBillTask: taskList){
                    if(outBoundFillBillTask.getMatterNo().equals(outBoundSaleVO.getMatterNo()) ){
                        //总数加回去
                        outBoundSaleVO.setMatterNumber(outBoundSaleVO.getMatterNumber()+outBoundFillBillTask.getOutNumber());
                    }
                    if(outBoundFillBillTask.getMatterNo().equals(outBoundSaleVO.getMatterNo())  && outBoundFillBillTask.getDepotId().equals(outBoundSaleVO.getDepotId())){
                        //对应位置的总数加回去
                        if(outBoundSaleVO.getAddUseNumber()==null){
                            outBoundSaleVO.setAddUseNumber(outBoundFillBillTask.getOutNumber());
                        }else{
                            outBoundSaleVO.setAddUseNumber(outBoundSaleVO.getAddUseNumber()+outBoundFillBillTask.getOutNumber());
                        }
                        if(outBoundSaleVO.getOutNumber()==null){
                            outBoundSaleVO.setOutNumber(outBoundFillBillTask.getOutNumber());
                        }else{
                            outBoundSaleVO.setOutNumber(outBoundSaleVO.getOutNumber()+outBoundFillBillTask.getOutNumber());
                        }
                        //对应位置的已拣数加回去

                    }
                }
            }
//                outBoundSaleVOTaskExtMapper.savePosition(result);
//                baseDepotToMatterExtMapper.updateUseNumberFB(result);
            Map<String,List> map = new HashMap<String,List>();
            for (OutBoundSaleVO data:result){
                String depotId= data.getDepotId();
                String position = depotId.substring(depotId.length()-6,depotId.length()-5);
                String number = depotId.substring(depotId.length()-5,depotId.length()-3);
                data.setPositionNumber(number);
                if (map.get(position) == null){
                    List <OutBoundSaleVO> newList = new ArrayList<OutBoundSaleVO>();
                    newList.add(data);
                    map.put(position,newList);
                }
                else{
                    map.get(position).add(data);
                }
            }
            return ResultUtil.success(map);
        }catch(Exception e){
            return ResultUtil.error(e.getMessage());
        }

    }


    private List<OutBoundSaleVO> findBestPositionNewSL(List<OutBoundSaleVO> queryList) throws Exception {
        List<String> test = new ArrayList<>();
        Map<String,List> map = new HashMap<String,List>();
        for (OutBoundSaleVO outBoundSaleVO :queryList){
            if (map.get(outBoundSaleVO.getMatterNo()) == null){
                List <OutBoundSaleVO> newList = new ArrayList<OutBoundSaleVO>();
                newList.add(outBoundSaleVO);
                map.put(outBoundSaleVO.getMatterNo(),newList);
            }
            else{
                map.get(outBoundSaleVO.getMatterNo()).add(outBoundSaleVO);
            }
        }
        List <OutBoundSaleVO> result = new ArrayList<OutBoundSaleVO>();
        for (Map.Entry<String, List> entry : map.entrySet()) {
            List<OutBoundSaleVO> info = entry.getValue();
            if (info.size()==1 && (info.get(0).getDepotId()=="" ||info.get(0).getDepotId()==null)){
                throw new Exception("销售单中"+info.get(0).getMatterNo()+"/"+info.get(0).getMatterName()+"物料在库存无剩余！请补充");
            }
            if (info.size()>0 && info.get(0).getDepotId()!="" && info.get(0).getDepotId()!=null){
                List<OutBoundSaleVO> retList = new ArrayList<OutBoundSaleVO>();
                List<OutBoundSaleVO> position = getPositionOneMatterNewSL(info,info.get(0).getMatterNumber(),retList);
                result.addAll(position);
            }
        }
        return result;
    }

    private List<OutBoundSaleVO> getPositionOneMatterNewSL(List<OutBoundSaleVO> list,Long num,List<OutBoundSaleVO> retList) throws Exception {
        OutBoundSaleVO first = list.get(0);
        Long  freeNum=first.getRealNumber();
        if (freeNum>=num){
            first.setAddUseNumber(num);
            retList.add(first);
            return retList;
        }else {
            if (list.size()==1){
                throw new Exception("库存中："+first.getMatterNo()+"/"+first.getMatterName()+" 的数量小于销售单需求数量！请补充");
            }else{
                first.setAddUseNumber(freeNum);
                retList.add(first);
                list.remove(0);
                return getPositionOneMatterNewSL(list,num-freeNum,retList);
            }
        }
    }

    /**
     * 销售单更新拣货状态和数量
     * @param outBoundFillBillTask
     * @return
     */
    @Override
    @Transactional
    public ResultVO outBoundMatterSL(OutBoundFillBillTask outBoundFillBillTask) throws ParseException {
        List<OutBoundFillBillTask> queryList= outBoundFillBillTaskExtMapper.findTransferId(outBoundFillBillTask);
        List<OutBoundFillBillTask> matterNumberInfo= outBoundFillBillTaskExtMapper.findMatterNumberId(outBoundFillBillTask);
        String uuid = UUID.randomUUID().toString().replaceAll("-","").substring(0,9);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = df.parse(df.format(new Date()));
        if (queryList.size()==0){
            outBoundFillBillTask.setTransferId(uuid);
            outBoundFillBillTask.setTransferDate(date);
//            for (OutBoundFillBillTask matter :matterNumberInfo){
//                if (matter.getMatterNo().equals(outBoundFillBillTask.getMatterNo()) && matter.getMatterNumber()==outBoundFillBillTask.getOutNumber()){
//                    //该销售单的该物料已经调拨完成
//                    outBoundFillBillTaskExtMapper.updateTransferStatus(outBoundFillBillTask);
//                }
//            }
            outBoundFillBillTaskExtMapper.insertTransferInfo(outBoundFillBillTask);
        }else{
            boolean flag = true;
            Long num = 0L;
            for (OutBoundFillBillTask task :queryList){
                //原储位库房、目标库房不同都需要新创调拨单
                if (task.getDepotId().substring(0,1).equals(outBoundFillBillTask.getDepotId().substring(0,1)) && task.getTargetDepot().substring(0,1).equals(outBoundFillBillTask.getTargetDepot().substring(0,1))){
                    outBoundFillBillTask.setTransferId(queryList.get(0).getTransferId());
                    flag=false;
                    break;
                }
            }
            if (flag){
                outBoundFillBillTask.setTransferId(uuid);
                outBoundFillBillTask.setTransferDate(date);
                outBoundFillBillTaskExtMapper.insertTransferInfo(outBoundFillBillTask);
            }

        }

        outBoundFillBillTaskExtMapper.outBoundMatterSL(outBoundFillBillTask);
        baseDepotToMatterExtMapper.updateMatterInfoSL(outBoundFillBillTask);

        List<OutBoundFillBillTask> transferList = outBoundFillBillTaskExtMapper.findTransferInfoCount(outBoundFillBillTask.getTransferId());
        boolean pass=true;
        for (OutBoundFillBillTask trans:transferList){
            for (OutBoundFillBillTask sale:matterNumberInfo){
                if (trans.getMatterNo().equals(sale.getMatterNo())){
                    if(trans.getOutNumber()==sale.getMatterNumber()){
                        pass=false;
                        break;
                    }
                }
            }
        }
        if (pass){
            outBoundFillBillTaskExtMapper.updateTransferStatus(outBoundFillBillTask);
        }
        return ResultUtil.success(baseDepotToMatterExtMapper.updateProductInfo(outBoundFillBillTask));

//        return ResultUtil.success(baseDepotToMatterExtMapper.updateCaseInfoSL(outBoundFillBillTask));
    }



    /**
     * 分页查询销售单
     * @param queryBillDTO
     * @return
     */
    @Override
    public ResultVO findTransferOrder(QueryBillDTO queryBillDTO) {
        // 分页
        PageHelper.startPage(queryBillDTO.getPageNum(), queryBillDTO.getPageSize());
        List<OutBoundFillBillTask> queryList = outBoundFillBillTaskExtMapper.findTransferOrder(queryBillDTO);
        PageInfo<OutBoundFillBillTask> pageInfo = new PageInfo<OutBoundFillBillTask>(queryList);
//        // copy数据
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return pageInfoVO;
    }


    /**
     * 查询调拨单详情
     * @param ID
     * @return
     */
    @Override
    public ResultVO findTransferInfo(String ID) {
        List<OutBoundFillBillTask> queryList = outBoundFillBillTaskExtMapper.findTransferInfo(ID);
        return ResultUtil.success(queryList);
    }

}
