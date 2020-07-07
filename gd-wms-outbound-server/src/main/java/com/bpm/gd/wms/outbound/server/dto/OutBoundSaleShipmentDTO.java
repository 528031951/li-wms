package com.bpm.gd.wms.outbound.server.dto;

import com.bpm.gd.wms.outbound.common.dto.PageDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ApiModel(description = "销售出库单（出通单）")
public class OutBoundSaleShipmentDTO extends PageDTO {


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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date establishDate;

}