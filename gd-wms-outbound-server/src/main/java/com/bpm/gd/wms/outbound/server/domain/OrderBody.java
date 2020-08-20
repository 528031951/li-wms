package com.bpm.gd.wms.outbound.server.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @Author Super Young
 * @Date 2020/8/6 9:21
 */
@Data
@ApiModel(description = "单身")
@Accessors(chain = true)
public class OrderBody {

    @ApiModelProperty(value = "工单号")
    private String  workOrderCode;

    @ApiModelProperty(value = "需求料号")
    private String  materialItemNo;

    @ApiModelProperty(value = "产品特征")
    private String  eigenvalue;

    @ApiModelProperty(value = "单位")
    private String  unit;

    @ApiModelProperty(value = "应发数量")
    private BigDecimal issuedQuantity;

    @ApiModelProperty(value = "已发数量")
    private BigDecimal  sendQuantity;

}
