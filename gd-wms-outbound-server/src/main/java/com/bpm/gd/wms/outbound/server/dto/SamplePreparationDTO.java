package com.bpm.gd.wms.outbound.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@ApiModel("样件备料DTO")
@Accessors(chain = true)
public class SamplePreparationDTO {

    @ApiModelProperty("工单编号")
    private String workOrderCode;

    @ApiModelProperty("物料编号")
    private String materialNo;

    @ApiModelProperty("储位与箱子的中间表主键id")
    private String toCaseId;

    @ApiModelProperty("储位主键Id")
    private String toMatterId;

    @ApiModelProperty("样件数量")
    private BigDecimal sampleQuantity;

    @ApiModelProperty("用户id")
    private Integer userId;
}
