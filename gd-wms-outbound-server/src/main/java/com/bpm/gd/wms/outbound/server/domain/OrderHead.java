package com.bpm.gd.wms.outbound.server.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @Author Super Young
 * @Date 2020/8/6 9:20
 */
@Data
@ApiModel(description = "单头")
@Accessors(chain = true)
public class OrderHead {

    @ApiModelProperty(value = "工单号")
    private String workOrderCode;

    @ApiModelProperty(value = "申请人")
    private String  applyUserCode;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "生管人员")
    private String  managementUser;

    @ApiModelProperty(value = "班组 A/B")
    private String  shiftName;

    @ApiModelProperty(value = "产线编号")
    private String  areaCode;

    @ApiModelProperty(value = "备注")
    private String  remarks;

    @ApiModelProperty(value = "生产批号")
    private String  productionBatch;
}
