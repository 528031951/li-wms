package com.bpm.gd.wms.outbound.server.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "送货单对象")
public class SendOrder {

    @ApiModelProperty("订单ID")
    private String orderNo;

    @ApiModelProperty("物料ID")
    private String materialNo;

    @ApiModelProperty("物料数量")
    private String materialNumber;


}
