package com.bpm.gd.wms.outbound.server.controller;

import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.dto.ProductOutBoundDTO;
import com.bpm.gd.wms.outbound.server.service.ProductOutBoundService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Super Young
 * @Date 2020/8/17 10:33
 */
@RestController
@RequestMapping("/product")
@Api(description = "成品出库相关接口")
public class ProductOutBoundController {

    @Autowired
    private ProductOutBoundService productOutBoundService;

    @ApiOperation(value = "成品出库")
    @PostMapping("/outBound")
    public ResultVO outBound(@RequestBody ProductOutBoundDTO productOutBoundDTO){
        return productOutBoundService.outBound(productOutBoundDTO);
    }

    @ApiOperation(value = "判断扫描的是箱子还是托盘，并返回信息")
    @GetMapping("/BoxOrTray")
    public ResultVO BoxOrTray(String code){
        return productOutBoundService.BoxOrTray(code);
    }

    @ApiOperation(value = "出通单详情")
    @GetMapping("/outOrderDetail")
    public ResultVO outOrderDetail(String shipmentNo){
        return productOutBoundService.outOrderDetail(shipmentNo);
    }
}
