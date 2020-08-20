package com.bpm.gd.wms.outbound.server.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(description = "工单VO")
public class WorkOrderVO {

    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("产线编号")
    private String areaCode;

    @ApiModelProperty("生产物料编码")
    private String materialCode;

    @ApiModelProperty("生产物料名称")
    private String materialName;

    @ApiModelProperty("生产数量")
    private BigDecimal quantity;

    @ApiModelProperty("班次名称")
    private String shiftName;

    @ApiModelProperty("工单号")
    private String workOrderCode;

    @ApiModelProperty("工单状态")
    private Long workOrderState;

    @ApiModelProperty("生产物料单位")
    private String workUnit;

    @ApiModelProperty("工单类型")
    private String workOrderType;

    @ApiModelProperty("计划结束时间")
    private Date planEndTime;

    @ApiModelProperty("计划开始时间")
    private Date planStartTime;

}
