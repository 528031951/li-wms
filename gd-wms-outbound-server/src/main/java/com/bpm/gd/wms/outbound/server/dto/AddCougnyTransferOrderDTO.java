package com.bpm.gd.wms.outbound.server.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 调拨单
 */
@Data
@ApiModel(description = "添加调拨单DTO")
public class AddCougnyTransferOrderDTO {

    @ApiModelProperty("主键id")
    private Long id;

    @ApiModelProperty("成品编号")
    private String productId;//物料编号


    @ApiModelProperty("成品名称")
    private String productName;//物料名称


    @ApiModelProperty("库位编号")
    private String storageLocationCod;//高位架id


    @ApiModelProperty("出货数量")
    private String shipmentNumber;//数量


    @ApiModelProperty("库位名称")
    private String storageLocationName;//调出库房


    @ApiModelProperty("成品规格")
    private String productSpecifications;


    @ApiModelProperty("出通单号")
    private String shipmentNo;


    @ApiModelProperty("客户料号")
    private String customerMaterialNumber;


    @ApiModelProperty("客户名称")
    private String customerName;


    @ApiModelProperty("货物备注")
    private String shipmentRemarks;


    @ApiModelProperty("出货性质")
    private String shipmentType;


    @ApiModelProperty("客户编号")
    private String customerId;


    @ApiModelProperty("单位")
    private String productUnit;


    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date establishDate;

    @ApiModelProperty("调入库房")
    private String putInWarehouse;


    private Long shipmentNumberLong;//数量


}