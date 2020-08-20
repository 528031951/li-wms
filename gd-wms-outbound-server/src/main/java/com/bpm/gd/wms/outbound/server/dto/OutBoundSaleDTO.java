package com.bpm.gd.wms.outbound.server.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author Super Young
 * @Date 2020/7/26 11:34
 */
@Data
@ApiModel(description = "销售出库单")
public class OutBoundSaleDTO {


    @ApiModelProperty("出通单号")
    private String shipmentNo;


    @ApiModelProperty("单据状态")
    private String shipmentStatus;


    @ApiModelProperty("客户编号")
    private String customerId;


    @ApiModelProperty("客户名称")
    private String customerName;


    @ApiModelProperty("出货性质")
    private String shipmentType;


    @ApiModelProperty("出货备注")
    private String shipmentRemarks;


    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date establishDate;

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


}
