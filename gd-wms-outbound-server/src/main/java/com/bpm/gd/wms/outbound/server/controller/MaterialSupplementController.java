package com.bpm.gd.wms.outbound.server.controller;

import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.dto.MaterialWasteDTO;
import com.bpm.gd.wms.outbound.server.dto.QueryWorkOderWebDTO;
import com.bpm.gd.wms.outbound.server.dto.ScanBoxCodeDTO;
import com.bpm.gd.wms.outbound.server.service.MaterialSupplementService;
import com.bpm.gd.wms.outbound.server.service.ProductionPreparationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/materialSupplement")
@Api(description = "工单补料Controller")
public class MaterialSupplementController {

    @Resource
    private ProductionPreparationService productionPreparationService;
    @Resource
    private MaterialSupplementService materialSupplementService;

    @ApiOperation("从MES系统中接收工单的料废信息")
    @RequestMapping(
            value = {"/receiveMaterialWasteList"},
            method = {RequestMethod.POST}
    )
    public ResultVO receiveMaterialWasteList(@RequestBody List<MaterialWasteDTO> list){
        return materialSupplementService.receiveMaterialWasteList(list);
    }

    @ApiOperation("根据用户ID查询工单信息")
    @RequestMapping(
            value = {"/selectWorkOrderListByUserId"},
            method = {RequestMethod.GET}
    )
    @ApiImplicitParam(name = "userId", value = "用户ID", dataType = "Integer")
    public ResultVO selectWorkOrderListByUserId(Integer userId) {

        return materialSupplementService.selectWorkOrderListByUserId(userId);
    }

    @ApiOperation("根据补料单号查询物料信息以及推荐流利架储位")
    @RequestMapping(
            value = {"/selectMaterialListByWorkOrderId"},
            method = {RequestMethod.GET}
    )
    @ApiImplicitParam(name = "supplementCode", value = "补料单号", dataType = "String")
    public ResultVO selectMaterialListBySupplementCode(String supplementCode){
        return materialSupplementService.selectMaterialListBySupplementCode(supplementCode);
    }


    @ApiOperation("扫描小包装或箱子上的序列号")
    @RequestMapping(
            value = {"/scanBoxCode"},
            method = {RequestMethod.POST}
    )
    public ResultVO scanBoxCode(@RequestBody ScanBoxCodeDTO dto){
        return materialSupplementService.scanBoxCode(dto.getBoxCode(),dto.getSupplementCode());
    }

    @ApiOperation("提交扫描的物料")
    @RequestMapping(
            value = {"/submitSupplementMaterial"},
            method = {RequestMethod.POST}
    )
    public ResultVO submitSupplementMaterial(@RequestBody ScanBoxCodeDTO dto){
        return materialSupplementService.submitSupplementMaterial(dto.getSupplementCode(),dto.getBoxCode(),dto.getType(),dto.getStorageCode(),dto.getUserId(),dto.getAccurateQuantity());
    }

    @ApiOperation("根据扫描的批次号，查询物料信息")
    @RequestMapping(
            value = {"/selectQuantityByScanvalue"},
            method = {RequestMethod.POST}
    )
    public BigDecimal selectQuantityByScanvalue(@RequestBody Map<String,String> params){
        return materialSupplementService.selectMaterialInfoByScanvalue(params.get("workOrderCode"),params.get("scanValue"));
    }


    @ApiOperation("条件查询补料所有工单信息WEB")
    @RequestMapping(
            value = {"/selectWorkOrderMaterialSupplementAll"},
            method = {RequestMethod.POST}
    )
    public ResultVO selectWorkOrderMaterialSupplementAll(@RequestBody QueryWorkOderWebDTO queryWorkOderWebDTO) {
        return materialSupplementService.selectWorkOrderMaterialSupplementAll(queryWorkOderWebDTO);
    }

    @ApiOperation("根据补料工单号查询补料工单物料信息WEB")
    @RequestMapping(
            value = {"/selectWorkOrderMaterialSupplementByWorkOrderId"},
            method = {RequestMethod.POST}
    )
    public ResultVO selectWorkOrderMaterialSupplementByWorkOrderId(@RequestBody QueryWorkOderWebDTO queryWorkOderWebDTO) {
        return materialSupplementService.selectWorkOrderMaterialSupplementByWorkOrderId(queryWorkOderWebDTO);
    }

    @ApiOperation("向T100提交出库")
    @RequestMapping(
            value = {"/submitOutBoundMaterialList"},
            method = {RequestMethod.POST}
    )
    public ResultVO submitOutBoundMaterialList(@RequestBody ScanBoxCodeDTO dto) {
        return materialSupplementService.submitOutBound(dto.getWorkOrderId(),dto.getUserId());
    }

}
