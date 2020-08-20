package com.bpm.gd.wms.outbound.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel(description = "扫描箱子序列号的DTO")
public class ScanBoxCodeDTO {

    @ApiModelProperty("箱子序列号")
    private String boxCode;

    @ApiModelProperty("工单ID")
    private Integer workOrderId;

    @ApiModelProperty("序列号类型")
    private Integer type;

    @ApiModelProperty("储位")
    private String storageCode;

    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("精准拣货数量")
    private BigDecimal accurateQuantity;

    @ApiModelProperty("补料单号")
    private String supplementCode;

}
