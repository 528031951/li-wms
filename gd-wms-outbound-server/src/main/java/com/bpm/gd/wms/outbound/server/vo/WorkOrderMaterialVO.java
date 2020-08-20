package com.bpm.gd.wms.outbound.server.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel(description = "工单物料VO")
public class WorkOrderMaterialVO {

    @ApiModelProperty("主键ID")
    private Integer id;

    @ApiModelProperty("发料料号")
    private String materialItemNo;

    @ApiModelProperty("发料品名")
    private String materialNo;

    @ApiModelProperty("发料规格")
    private String materialSpec;

    @ApiModelProperty("产品特征（供应商）")
    private String eigenvalue;

    @ApiModelProperty("单位")
    private String unit;

    @ApiModelProperty("应发数量（WMS）")
    private BigDecimal issuedQuantity;

    @ApiModelProperty("已发数量（WMS）")
    private BigDecimal sendQuantity;

    @ApiModelProperty("工单ID")
    private Integer orderId;

    @ApiModelProperty("工单编号")
    private String workOrderCode;

    @ApiModelProperty("储位编号")
    private String storageCode;

    @ApiModelProperty("储位名称")
    private String storageName;

}
