package com.bpm.gd.wms.outbound.server.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 料废信息
 */
@Data
public class MaterialWasteDTO {

    @ApiModelProperty("工单id")
    private Integer workOrderId;

    @ApiModelProperty("物料编号")
    private String materielCode;

    @ApiModelProperty("物料批次编号")
    private String materielBatchCode;

    @ApiModelProperty("报废数量")
    private BigDecimal wasteNumber;

    @ApiModelProperty("需求数量")
    private BigDecimal needNumber;

    @ApiModelProperty("已拣货数量")
    private BigDecimal sendNumber;

    @ApiModelProperty("状态 0-新建，1-已上报")
    private Long status;

    @ApiModelProperty("工单号")
    private String workOrderCode;

    @ApiModelProperty("0：工废，1：料废，2：联代报废")
    private Integer wasteType;

    @ApiModelProperty("单位")
    private String materielUnit;

    @ApiModelProperty("产品特征（供应商）")
    private String eigenvalue;
}
