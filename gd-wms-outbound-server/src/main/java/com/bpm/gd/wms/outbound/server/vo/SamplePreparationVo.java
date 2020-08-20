package com.bpm.gd.wms.outbound.server.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel(description = "样件备料VO")
public class SamplePreparationVo {

    @ApiModelProperty("出库主键id")
    private Long recordId;

    @ApiModelProperty("物料编号")
    private String materialNo;

    @ApiModelProperty("物料名称")
    private String materialName;

    @ApiModelProperty("储位主键Id")
    private String toMatterId;

    @ApiModelProperty("储位库存数量")
    private BigDecimal allNumber;

    @ApiModelProperty("储位与箱子的中间表主键id")
    private String toCaseId;

    @ApiModelProperty("箱子真实存放数量")
    private BigDecimal realNumber;


}
