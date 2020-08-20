package com.bpm.gd.wms.outbound.server.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bpm.gd.wms.outbound.common.util.ResultUtil;
import com.bpm.gd.wms.outbound.common.vo.PageInfoVO;
import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.domain.*;
import com.bpm.gd.wms.outbound.server.dto.MaterialOutBoundDTO;
import com.bpm.gd.wms.outbound.server.dto.OrderBody;
import com.bpm.gd.wms.outbound.server.dto.OrderHead;
import com.bpm.gd.wms.outbound.server.dto.SamplePreparationDTO;
import com.bpm.gd.wms.outbound.server.mapper.base.BaseDepotToCaseMapper;
import com.bpm.gd.wms.outbound.server.mapper.base.BaseDepotToMatterMapper;
import com.bpm.gd.wms.outbound.server.mapper.base.SysUserMapper;
import com.bpm.gd.wms.outbound.server.mapper.base.WarehousingOutRecordMapper;
import com.bpm.gd.wms.outbound.server.mapper.ext.HvPmWorkOrderExtMapper;
import com.bpm.gd.wms.outbound.server.mapper.ext.WarehousingOutRecordExtMapper;
import com.bpm.gd.wms.outbound.server.service.SamplePreparationService;
import com.bpm.gd.wms.outbound.server.util.CheckObjectIsEmpty;
import com.bpm.gd.wms.outbound.server.vo.SamplePreparationVo;
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
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
@PropertySource("classpath:application-dev.yml")//读取application-dev.yml文件
public class SamplePreparationServiceImpl implements SamplePreparationService {
    @Resource
    private WarehousingOutRecordExtMapper warehousingOutRecordExtMapper;
    @Resource
    private HvPmWorkOrderExtMapper hvPmWorkOrderExtMapper;
    @Resource
    private BaseDepotToCaseMapper baseDepotToCaseMapper;
    @Resource
    private BaseDepotToMatterMapper baseDepotToMatterMapper;
    @Resource
    private WarehousingOutRecordMapper warehousingOutRecordMapper;
    @Resource
    private SysUserMapper sysUserMapper;
    @Value("${url}")
    private String url;

    /**
     * 根据用户id查询未提交的样件
     * @param userId
     * @return
     */
    @Override
    public ResultVO findUserSamplePreparation(Integer userId) {
       List<WarehousingOutRecord> warehousingOutRecord=warehousingOutRecordExtMapper.selectUserIdSample(userId);
        return ResultUtil.success(warehousingOutRecord);
    }

    /**
     * 根据工单号查询工单是否存在
     * @param workCode 工单号
     * @return
     */
    @Override
    public ResultVO findHvPmWorkOrderByOrderCode(String workCode) {
        String msg="";
       HvPmWorkOrder hvPmWorkOrder=hvPmWorkOrderExtMapper.selectByOrderCode(workCode);
       if(CheckObjectIsEmpty.checkStringIsNull(hvPmWorkOrder)){
           msg="该样件工单不存在，请核实后在重新扫描！";
           return ResultUtil.error(msg);
       }
        return ResultUtil.success("请继续扫描样件编号");
    }

    /**
     * 根据样件编号查询物料信息
     * @param matterCode  样件编号(物料编码)
     * @return
     */
    @Override
    public ResultVO findDepotToCaseByMatterCode(String matterCode){
       SamplePreparationVo samplePreparationVo=warehousingOutRecordExtMapper.selectDepotToCaseByMatterCode(matterCode);
       if(CheckObjectIsEmpty.checkStringIsNull(samplePreparationVo)){
           return ResultUtil.error("未查询到此样件编号物料清单，请核实后在重新扫描");
       }
        return ResultUtil.success(samplePreparationVo);
    }

    /**
     * 保存样件数量信息
     * @param dto
     * @return
     */
    @Override
    public ResultVO addDepotToCaseByMatter(SamplePreparationDTO dto) {
        String msg="";
        boolean flag=true;
        //判断参数是否为null
        if(CheckObjectIsEmpty.checkStringIsNull(dto.getWorkOrderCode(),
                dto.getMaterialNo(),dto.getToCaseId(),dto.getToMatterId(),
                dto.getSampleQuantity(),dto.getUserId())){
            msg="参数错误";
            return ResultUtil.error(msg);
        }

        //根据工单编码查询工单信息
        HvPmWorkOrder hvPmWorkOrder=hvPmWorkOrderExtMapper.selectByOrderCode(dto.getWorkOrderCode());
        if(CheckObjectIsEmpty.checkStringIsNull(hvPmWorkOrder)){
            msg="该样件工单不存在，请核实后在重新扫描！";
            return ResultUtil.error(msg);
        }

        //根据物料编码查询物料信息
       List<WarehousingRecord> warehousingRecord=warehousingOutRecordExtMapper.selectWarehousingRecord(dto.getMaterialNo());
        if(warehousingRecord.size()==0){
            msg="未查询到此样件物料信息！";
            return ResultUtil.error(msg);
        }
        WarehousingRecord warehousingRecords = warehousingRecord.get(0);

        //根据储位与箱子的中间表主键id查询箱子数量
        BaseDepotToCase baseDepotToCase = baseDepotToCaseMapper.selectByPrimaryKey(dto.getToCaseId());
        if(CheckObjectIsEmpty.checkStringIsNull(baseDepotToCase)){
            msg="未查询到此物料箱子信息！";
            return ResultUtil.error(msg);
        }

        //根据储位主键Id查询储位数量
        BaseDepotToMatter baseDepotToMatter = baseDepotToMatterMapper.selectByPrimaryKey(dto.getToMatterId());
        if(CheckObjectIsEmpty.checkStringIsNull(baseDepotToMatter)){
            msg="未查询到此物料箱子储位信息！";
            return ResultUtil.error(msg);
        }

        //数量大于箱子总数量
        if(dto.getSampleQuantity().compareTo(baseDepotToCase.getRealNumber())>0){
            msg="数量不能大于箱子总数量";
            flag=false;
        }

        if(dto.getSampleQuantity().compareTo(baseDepotToMatter.getAllNumber())>0){
            msg="数量不能大于库存总数量";
            flag=false;
        }

        if(flag){
            //1.向出库记录表中新增出库记录
            WarehousingOutRecord record = new WarehousingOutRecord();
            record.setMaterialNo(warehousingRecords.getMaterialNo())
                    .setMaterialName(warehousingRecords.getMaterialName())
                    .setSupplierNo(warehousingRecords.getSupplierNo())
                    .setSupplierName(warehousingRecords.getSupplierName())
                    .setWarehousingOutType("0")
                    .setStorageNo(baseDepotToMatter.getDepotId())
                    .setWarehousingOutTime(new Date())
                    .setBoxNo(baseDepotToCase.getCaseNo())
                    .setCount(dto.getSampleQuantity())
                    .setUnit(warehousingRecords.getUnit())
                    .setOrderNo(dto.getWorkOrderCode())
                    .setOperatorId(dto.getUserId().longValue())
                    .setStatus("0")
                    .setAreaCode(hvPmWorkOrder.getAreaCode());
            warehousingOutRecordMapper.insert(record);

            //2.修改箱子剩余数量
            baseDepotToCase.setRealNumber(baseDepotToCase.getRealNumber().subtract(dto.getSampleQuantity()));
            baseDepotToCaseMapper.updateByPrimaryKeySelective(baseDepotToCase);

            //修改储位剩余信息
            baseDepotToMatter.setAllNumber(baseDepotToMatter.getAllNumber().subtract(dto.getSampleQuantity()));
            baseDepotToMatterMapper.updateByPrimaryKey(baseDepotToMatter);
            return ResultUtil.success("添加成功");
        }
        return ResultUtil.error(msg);
    }

    /**
     * 向T100提交出库
     * @param userId  用户id
     * @return
     */
    @Override
    public ResultVO submitOutBound(Integer userId) {
        String msg="";
        boolean flag=true;
        //根据用户id查询未提交的样件
        List<WarehousingOutRecord> list=warehousingOutRecordExtMapper.selectWarehousingOutRecordByUserId(userId);
        if(list.size()==0){
            msg="未查询到未提交的入库数据，请勿频繁点击";
            return ResultUtil.error(msg);
        }

        //根据userId查询角色信息
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId.longValue());
        if(CheckObjectIsEmpty.checkStringIsNull(sysUser)){
            msg="未查询到当前登录角色信息，请确认后重试！";
           return ResultUtil.error(msg);
        }

        for (WarehousingOutRecord lists : list) {
            //组装数据
            MaterialOutBoundDTO materialOutBoundDTO=new MaterialOutBoundDTO();

            //根据工单号查询工单信息
            HvPmWorkOrder hvPmWorkOrder=hvPmWorkOrderExtMapper.selectByOrderCode(lists.getOrderNo());
            if(CheckObjectIsEmpty.checkStringIsNull(hvPmWorkOrder)){
                msg="未查询到《"+lists.getOrderNo()+"》工单信息，请核实后在重试";
                return ResultUtil.error(msg);
            }

            //添加单头数据
            OrderHead orderHead=new OrderHead();
            orderHead.setWorkOrderCode(hvPmWorkOrder.getWorkOrderCode())
                    .setApplyUserCode(sysUser.getAccount())
                    .setCreateTime(new Date())
                    .setManagementUser(hvPmWorkOrder.getManagementUser())
                    .setShiftName(hvPmWorkOrder.getShiftName())
                    .setAreaCode(hvPmWorkOrder.getAreaCode())
                    .setRemarks(hvPmWorkOrder.getRemarks())
                    .setProductionBatch(hvPmWorkOrder.getProductionBatch());
            materialOutBoundDTO.setOrderHead(orderHead);

            //根据工单与用户id查询出库信息
           List<WarehousingOutRecord> outRecordList=warehousingOutRecordExtMapper.selectUserIdAndCode(hvPmWorkOrder.getWorkOrderCode(),userId);
            //添加单身数据
            List<OrderBody> orderBodies=new ArrayList<>();
            if(outRecordList.size()>0){
                for (WarehousingOutRecord warehousingOutRecord : outRecordList) {
                    OrderBody orderBody=new OrderBody();
                    orderBody.setWorkOrderCode(hvPmWorkOrder.getWorkOrderCode())
                            .setMaterialItemNo(warehousingOutRecord.getMaterialNo())
                            .setEigenvalue(hvPmWorkOrder.getEigenvalue())
                            .setUnit(hvPmWorkOrder.getWorkUnit())
                            .setIssuedQuantity(warehousingOutRecord.getCount())
                            .setSendQuantity(warehousingOutRecord.getCount());
                    orderBodies.add(orderBody);
                }
            }
            //上传T100
            materialOutBoundDTO.setList(orderBodies);
            ResultVO resultVO = this.addT100(materialOutBoundDTO);
            int code=200;
            if(resultVO.getCode()!=code){
                msg=resultVO.getMsg();
                return ResultUtil.error(msg);
            }
        }

        //根据用户id修改出库状态为已提交
        try {
            warehousingOutRecordExtMapper.updateWarehousingOutRecordByUserId(userId);
        }catch (Exception e){
            msg="修改出库状态信息失败，请重试！";
            return ResultUtil.error(msg);
        }
        return ResultUtil.success("上传T100成功！");
    }

    /**
     * 查询所有样件备料出库信息
     * @param pageNum  当前页
     * @param pageSize  结束页
     * @return
     */
    @Override
    public ResultVO findSampleAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        //查询所有样件备料出库信息
        List<WarehousingOutRecord> warehousingOutRecordList=warehousingOutRecordExtMapper.selectAll();
        //将查询出来的数据放入到mybtis分页中进行分页
        PageInfo<WarehousingOutRecord> hvGdWorkBomPageInfo = new PageInfo<>(warehousingOutRecordList);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(hvGdWorkBomPageInfo,pageInfoVO);
        pageInfoVO.setData(hvGdWorkBomPageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }

    /**
     * 上传T100
     * @param materialOutBoundDTO
     * @return
     */
    public ResultVO addT100(MaterialOutBoundDTO materialOutBoundDTO){
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
        return ResultUtil.success("上传T100成功");
    }

}
