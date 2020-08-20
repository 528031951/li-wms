package com.bpm.gd.wms.outbound.server.controller;

import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.dto.MaterialOutBoundDTO;
import com.bpm.gd.wms.outbound.server.service.OutBoundMaterialService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Super Young
 * @Date 2020/8/5 15:32
 */
@Api(description = "领料出库接口")
@RestController
@RequestMapping("/outBoundMaterial")
public class OutBoundMaterialController {

    @Autowired
    private OutBoundMaterialService outBoundMaterialService;

    @ApiOperation(value = "领料出库,回传T100")
    @PostMapping("/outBound")
    public ResultVO outBound(@RequestBody MaterialOutBoundDTO materialOutBoundDTO){
        String status="11";
        String orderType="-1";
        return outBoundMaterialService.outBound(materialOutBoundDTO,status,orderType);
    }

    @ApiOperation(value = "超耗领料,回传T100")
    @PostMapping("/consumption")
    public ResultVO consumption(@RequestBody MaterialOutBoundDTO materialOutBoundDTO){
        String status="12";
        String orderType="-1";
        return outBoundMaterialService.outBound(materialOutBoundDTO,status,orderType);
    }

    @ApiOperation(value = "欠料补料,回传T100")
    @PostMapping("/addMaterial")
    public ResultVO addMaterial(@RequestBody MaterialOutBoundDTO materialOutBoundDTO){
        String status="13";
        String orderType="-1";
        return outBoundMaterialService.outBound(materialOutBoundDTO,status,orderType);
    }

    @ApiOperation(value = "余料退料，回传T100")
    @PostMapping("/excess")
    public ResultVO excess(@RequestBody MaterialOutBoundDTO materialOutBoundDTO){
        String status="23";
        String orderType="1";
        return outBoundMaterialService.outBound(materialOutBoundDTO,status,orderType);
    }
}
