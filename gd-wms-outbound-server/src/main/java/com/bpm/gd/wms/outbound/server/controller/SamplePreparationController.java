package com.bpm.gd.wms.outbound.server.controller;

import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.dto.PageDTO;
import com.bpm.gd.wms.outbound.server.dto.SamplePreparationDTO;
import com.bpm.gd.wms.outbound.server.service.SamplePreparationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sample")
@Api(description = "样件备料Controller")
public class SamplePreparationController {

    @Autowired
    private SamplePreparationService samplePreparationService;

    @ApiOperation("根据用户id查询未提交样件")
    @RequestMapping(
            value = {"/findUserSamplePreparation"},
            method = {RequestMethod.GET}
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id", dataType = "Integer"),
    })
    public ResultVO findUserSamplePreparation(Integer userId){
        return samplePreparationService.findUserSamplePreparation(userId);
    }

    @ApiOperation("根据工单号查询工单是否存在")
    @RequestMapping(
            value = {"/findHvPmWorkOrderByOrderCode"},
            method = {RequestMethod.GET}
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "workCode", value = "工单编号", dataType = "String"),
    })
    public ResultVO findHvPmWorkOrderByOrderCode(String workCode){
        return samplePreparationService.findHvPmWorkOrderByOrderCode(workCode);
    }

    @ApiOperation("根据样件编号查询物料信息")
    @RequestMapping(
            value = {"/findDepotToCaseByMatterCode"},
            method = {RequestMethod.GET}
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "matterCode", value = "样件编号", dataType = "String"),
    })
    public ResultVO findDepotToCaseByMatterCode(String matterCode){
       return samplePreparationService.findDepotToCaseByMatterCode(matterCode);
    }

    @ApiOperation("保存样件数量信息")
    @RequestMapping(
            value = {"/addDepotToCaseByMatter"},
            method = {RequestMethod.POST}
    )
    public ResultVO addDepotToCaseByMatter(@RequestBody SamplePreparationDTO samplePreparationDTO){
        return samplePreparationService.addDepotToCaseByMatter(samplePreparationDTO);
    }

    @ApiOperation("向T100提交出库")
    @RequestMapping(
            value = {"/submitOutBoundMaterialList"},
            method = {RequestMethod.GET}
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id", dataType = "Integer"),
    })
    public ResultVO submitOutBoundMaterialList(Integer userId) {
        return samplePreparationService.submitOutBound(userId);
    }

    @ApiOperation("查询所有样件备料出库信息")
    @RequestMapping(
            value = {"/findSampleAll"},
            method = {RequestMethod.POST}
    )
    public ResultVO findSampleAll(@RequestBody PageDTO pageDTO){
        return samplePreparationService.findSampleAll(pageDTO.getPageNum(),pageDTO.getPageSize());
    }
}
