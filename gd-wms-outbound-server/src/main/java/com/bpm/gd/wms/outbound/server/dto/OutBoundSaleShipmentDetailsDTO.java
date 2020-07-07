package com.bpm.gd.wms.outbound.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 销售出库单详情（出通单详情）
 */
@Data
@ApiModel(description = "销售出库单详情（出通单详情）")
public class OutBoundSaleShipmentDetailsDTO {


    @ApiModelProperty("主键id")
    private Long id;


    @ApiModelProperty("出通单号")
    private String shipmentNo;


    @ApiModelProperty("成品名称")
    private String productName;


    @ApiModelProperty("成品编号")
    private String productId;


    @ApiModelProperty("出货数量")
    private Long shipmentNumber;


    @ApiModelProperty("单位")
    private String productUnit;


    @ApiModelProperty("库位名称")
    private String storageLocationName;


    @ApiModelProperty("库位编号")
    private String storageLocationCod;


    @ApiModelProperty("已出货数量")
    private Long alreadyShipmentNumber;


    @ApiModelProperty("出货详情状态 1.未完成 2.完成")
    private String shipmentDetailsStatus;


    @ApiModelProperty("成品规格")
    private String productSpecifications;

    @ApiModelProperty("客户料号")
    private String customerMaterialNumber;
}