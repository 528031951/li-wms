package com.bpm.gd.wms.outbound.server.controller;

import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.dto.QueryWorkOderWebDTO;
import com.bpm.gd.wms.outbound.server.dto.ScanBoxCodeDTO;
import com.bpm.gd.wms.outbound.server.service.ProductionPreparationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/productionPreparation")
@Api(description = "生产备料Controller")
public class ProductionPreparationController {

    @Resource
    private ProductionPreparationService productionPreparationService;

    @ApiOperation("根据用户ID查询工单信息")
    @RequestMapping(
            value = {"/selectWorkOrderListByUserId"},
            method = {RequestMethod.GET}
    )
    @ApiImplicitParam(name = "userId", value = "用户ID", dataType = "Integer")
    public ResultVO selectWorkOrderListByUserId(Integer userId) {
        return productionPreparationService.selectWorkOrderListByUserId(userId);
    }

    @ApiOperation("根据工单ID和用户ID查询物料信息以及推荐流利架储位")
    @RequestMapping(
            value = {"/selectMaterialListByWorkOrderId"},
            method = {RequestMethod.GET}
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "workOrderId", value = "工单ID", dataType = "Integer"),
            @ApiImplicitParam(name = "userId", value = "用户ID ", dataType = "Integer")
    })
    public ResultVO selectMaterialListByWorkOrderId(Integer workOrderId, Integer userId){
        return productionPreparationService.selectOrderMaterialListByWorkOrderId(workOrderId,userId);
    }


    @ApiOperation("扫描小包装或箱子上的序列号")
    @RequestMapping(
            value = {"/scanBoxCode"},
            method = {RequestMethod.POST}
    )
    public ResultVO scanBoxCode(@RequestBody ScanBoxCodeDTO dto){
        return productionPreparationService.scanBoxCode(dto.getBoxCode(),dto.getWorkOrderId());
    }

    @ApiOperation("提交扫描的物料")
    @RequestMapping(
            value = {"/submitOutBoundMaterial"},
            method = {RequestMethod.POST}
    )
    public ResultVO submitOutBoundMaterial(@RequestBody ScanBoxCodeDTO dto){
        return productionPreparationService.submitOutBoundMaterial(dto.getWorkOrderId(),dto.getBoxCode(),dto.getType(),dto.getStorageCode(),dto.getUserId(),dto.getAccurateQuantity());
    }

    @ApiOperation("向T100提交出库")
    @RequestMapping(
            value = {"/submitOutBoundMaterialList"},
            method = {RequestMethod.POST}
    )
    public ResultVO submitOutBoundMaterialList(@RequestBody ScanBoxCodeDTO dto) {
        return productionPreparationService.submitOutBound(dto.getWorkOrderId(),dto.getUserId());
    }


    @ApiOperation("查询工单列表信息（WEB端）")
    @RequestMapping(
            value = {"/selectWorkOrderList"},
            method = {RequestMethod.GET}
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "workOrderCode", value = "工单编号", dataType = "String"),
            @ApiImplicitParam(name = "state", value = "工单类型", dataType = "Integer"),
            @ApiImplicitParam(name = "lineCode", value = "产线", dataType = "Integer")
    })
    public ResultVO selectWorkOrderList(@RequestParam("工单编号") String workOrderCode, @RequestParam("工单类型") Integer state,
                                        @RequestParam("产线") String lineCode) {
        return null;
    }

    @ApiOperation("条件查询所有工单信息WEB")
    @RequestMapping(
            value = {"/selectWorkOrderListAll"},
            method = {RequestMethod.POST}
    )
    public ResultVO selectWorkOrderListAll(@RequestBody QueryWorkOderWebDTO queryWorkOderWebDTO) {
        return productionPreparationService.selectWorkOrderListAll(queryWorkOderWebDTO);
    }

    @ApiOperation("根据工单号查询工单物料信息WEB")
    @RequestMapping(
            value = {"/selectWorkBomByWorkOrderId"},
            method = {RequestMethod.POST}
    )
    public ResultVO selectWorkBomByWorkOrderId(@RequestBody QueryWorkOderWebDTO queryWorkOderWebDTO) {
        return productionPreparationService.selectWorkBomByWorkOrderId(queryWorkOderWebDTO);
    }

}
