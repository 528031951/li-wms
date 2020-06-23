package com.bpm.gd.wms.outbound.server.controller;

import com.bpm.gd.srm.order.client.DdSrmOrderClient;
import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.domain.OutBoundFillBillTask;
import com.bpm.gd.wms.outbound.server.domain.SendOrder;
import com.bpm.gd.wms.outbound.server.dto.*;
import com.bpm.gd.wms.outbound.server.service.OutBoundService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

/**
 * <p>Title: BmDemoController</p>
 * <p>Description: demo控制类</p>
 * <p>Company: http://www.wootion.com/</p>
 * <p>create date: 2020/04/03</p>
 *
 * @author :chenyiwen
 * @version :1.0
 */
@RestController
@RequestMapping(value = "/outBound")
@Api(description = "出库管理")
public class outBoundController {

    @Autowired
    private DdSrmOrderClient ddSrmOrderClient;
    @Autowired
    private OutBoundService outBoundService;



    @ApiOperation("查询工单信息")
    @RequestMapping(
            value = {"/findWorkOrder"},
            method = {RequestMethod.GET}
    )

    public ResultVO findWorkOrder( QueryWorkOrderDTO queryWorkOrderDTO) {
        return outBoundService.findWorkOrder(queryWorkOrderDTO);
    }


    @ApiOperation("查询工单下的物料信息")
    @RequestMapping(
            value = {"/findWorkOrderMatter"},
            method = {RequestMethod.GET}
    )

    public ResultVO findWorkOrderMatter( @RequestParam String workOrderId) {
        return outBoundService.findWorkOrderMatter(workOrderId);
    }


    @ApiOperation("工单分配（系统自动）")
    @RequestMapping(
            value = {"/dispatchWorkOrder"},
            method = {RequestMethod.POST}
    )
    public ResultVO dispatchWorkOrder(@RequestBody IdsDTO idsDTO) {
        return outBoundService.dispatchWorkOrder(idsDTO);
        //bug:还没指定人
    }


    @ApiOperation("查询补料单信息")
    @RequestMapping(
            value = {"/findFillBill"},
            method = {RequestMethod.GET}
    )
    public ResultVO findFillBill( QueryFillBillDTO queryFillBillDTO) {
        return outBoundService.findFillBill(queryFillBillDTO);
    }

    @ApiOperation("查询补料单下的物料信息")
    @RequestMapping(
            value = {"/findFillBillMatter"},
            method = {RequestMethod.GET}
    )

    public ResultVO findFillBillMatter( @RequestParam String fillBillId) {

        return outBoundService.findFillBillMatter(fillBillId);
    }


    @ApiOperation("补料单分配（系统自动）")
    @RequestMapping(
            value = {"/dispatchFillBill"},
            method = {RequestMethod.POST}
    )
    public ResultVO dispatchFillBill(@RequestBody IdsDTO idsDTO) {
        return outBoundService.dispatchFillBill(idsDTO);
    }


    @ApiOperation("查询该员工下所有工单任务")
    @RequestMapping(
            value = {"/findTaskByUser"},
            method = {RequestMethod.GET}
    )
    public ResultVO findTaskByUser() {
        String name ="chenyiwen";
        return outBoundService.findTaskByUser(name);
    }

    @ApiOperation("查询该员工下所有的补料单任务")
    @RequestMapping(
            value = {"/findBillTaskByUser"},
            method = {RequestMethod.GET}
    )
    public ResultVO findBillTaskByUser() {
        String name ="chenyiwen";
        return outBoundService.findBillTaskByUser(name);
    }


    @ApiOperation("通过工单号查询该员工负责的物料信息")
    @RequestMapping(
            value = {"/findMatterByWorkOrder"},
            method = {RequestMethod.GET}
    )
    public ResultVO findMatterByWorkOrder(@RequestParam String workOrderId) {
        String name ="chenyiwen";
        return outBoundService.findMatterByWorkOrder(workOrderId,name);
    }

    @ApiOperation("通过补料单号查询该员工负责的物料信息")
    @RequestMapping(
            value = {"/findMatterByBill"},
            method = {RequestMethod.GET}
    )
    public ResultVO findMatterByBill(@RequestParam String fillBillId) {
        String name ="chenyiwen";
        return outBoundService.findMatterByBill(fillBillId,name);
    }

    @ApiOperation("查询工单下所有物料的位置")
    @RequestMapping(
            value = {"/findPositionByWorkOrder"},
            method = {RequestMethod.GET}
    )
    public ResultVO findPositionByWorkOrder(@RequestParam String workOrderId) {
        String name ="chenyiwen";
        return outBoundService.findPositionByWorkOrder(workOrderId,name);
    }

    @ApiOperation("查询补料单下所有物料的位置")
    @RequestMapping(
            value = {"/findPositionByBill"},
            method = {RequestMethod.GET}
    )
    public ResultVO findPositionByBill(@RequestParam String fillBillId) {
        String name ="chenyiwen";
        return outBoundService.findPositionByBill(fillBillId,name);
    }

    @ApiOperation("扫描储位二维码，查询该位置的物料信息")
    @RequestMapping(
            value = {"/findMatterByPosition"},
            method = {RequestMethod.GET}
    )
    public ResultVO findMatterByPosition(@RequestParam String depotId) {
        return outBoundService.findMatterByPosition(depotId);
    }

    @ApiOperation("扫描箱子或者小包装，返回数量和类型")
    @RequestMapping(
            value = {"/scanBoxOrPackage"},
            method = {RequestMethod.GET}
    )
    public ResultVO scanBoxOrPackage(@RequestParam String ID) {
        return outBoundService.scanBoxOrPackage(ID);
    }

    @ApiOperation("工单更新拣货数量和状态")
    @RequestMapping(
            value = {"/outBoundMatterWO"},
            method = {RequestMethod.POST}
    )

    public ResultVO outBoundMatterWO(@RequestBody OutBoundFillBillTask outBoundFillBillTask) {
        return outBoundService.outBoundMatterWO(outBoundFillBillTask);
    }
    @ApiOperation("补料单更新拣货数量和状态")
    @RequestMapping(
            value = {"/outBoundMatterFB"},
            method = {RequestMethod.POST}
    )

    public ResultVO outBoundMatterFB(@RequestBody OutBoundFillBillTask outBoundFillBillTask) {
        return outBoundService.outBoundMatterFB(outBoundFillBillTask);
    }



    @ApiOperation("送货单物料入库位置查询")
    @RequestMapping(
            value = {"/sendOrderInBound"},
            method = {RequestMethod.POST}
    )

    public ResultVO sendOrderInBound(@RequestBody List<SendOrder> list) {
        return outBoundService.sendOrderInBound(list);
    }


    @ApiOperation("成品信息查询（--->弃用<---）")
    @RequestMapping(
            value = {"/findProduct"},
            method = {RequestMethod.GET}
    )

    public ResultVO findProduct( QueryProductDTO queryProductDTO) {
        return outBoundService.findProduct(queryProductDTO);
    }


    @ApiOperation("成品信息查询(传入ids)（--->弃用<---）")
    @RequestMapping(
            value = {"/findProductById"},
            method = {RequestMethod.POST}
    )

    public ResultVO findProductById(@RequestBody IdsDTO idsDTO) {
        return outBoundService.findProductById(idsDTO);
    }
    @ApiOperation("成品出库（--->弃用<---）")
    @RequestMapping(
            value = {"/outProduct"},
            method = {RequestMethod.POST}
    )

    public ResultVO outProduct(@RequestBody List<QueryProductDTO> list) {
        return outBoundService.outProduct(list);
    }



    @ApiOperation("查询销售单信息")
    @RequestMapping(
            value = {"/findSaleInfo"},
            method = {RequestMethod.GET}
    )

    public ResultVO findSaleInfo( QueryBillDTO queryBillDTO) {
        return outBoundService.findSaleInfo(queryBillDTO);
    }

    @ApiOperation("查询销售单下的物料信息")
    @RequestMapping(
            value = {"/findSaleMatter"},
            method = {RequestMethod.GET}
    )

    public ResultVO findSaleMatter( @RequestParam String saleId) {

        return outBoundService.findSaleMatter(saleId);
    }


    @ApiOperation("销售单分配（系统自动）")
    @RequestMapping(
            value = {"/dispatchSale"},
            method = {RequestMethod.POST}
    )
    public ResultVO dispatchSale(@RequestBody IdsDTO idsDTO) {
        return outBoundService.dispatchSale(idsDTO);
    }



    @ApiOperation("查询该员工下所有的销售单任务")
    @RequestMapping(
            value = {"/findSaleTaskByUser"},
            method = {RequestMethod.GET}
    )
    public ResultVO findSaleTaskByUser() {
        String name ="chenyiwen";
        return outBoundService.findSaleTaskByUser(name);
    }

    @ApiOperation("查询销售单下所有物料的位置")
    @RequestMapping(
            value = {"/findPositionBySale"},
            method = {RequestMethod.GET}
    )
    public ResultVO findPositionBySale(@RequestParam String saleId) {
        String name ="chenyiwen";
        return outBoundService.findPositionBySale(saleId,name);
    }



    @ApiOperation("（成品出库）扫描箱子或者小包装，返回数量和类型")
    @RequestMapping(
            value = {"/scanBoxOrPackageProduct"},
            method = {RequestMethod.GET}
    )
    public ResultVO scanBoxOrPackageProduct(@RequestParam String ID) {
        return outBoundService.scanBoxOrPackageProduct(ID);
    }


    @ApiOperation("销售单更新拣货数量和状态")
    @RequestMapping(
            value = {"/outBoundMatterSL"},
            method = {RequestMethod.POST}
    )
    public ResultVO outBoundMatterSL(@RequestBody OutBoundFillBillTask outBoundFillBillTask) throws ParseException {
        return outBoundService.outBoundMatterSL(outBoundFillBillTask);
    }


    @ApiOperation("查询成品出库后的调拨单")
    @RequestMapping(
            value = {"/findTransferOrder"},
            method = {RequestMethod.GET}
    )
    public ResultVO findTransferOrder(QueryBillDTO queryBillDTO) {
        return outBoundService.findTransferOrder(queryBillDTO);
    }

    @ApiOperation("查询调拨单详情")
    @RequestMapping(
            value = {"/findTransferInfo"},
            method = {RequestMethod.GET}
    )
    public ResultVO findTransferInfo(@RequestParam String transferId) {
        return outBoundService.findTransferInfo(transferId);
    }

}
