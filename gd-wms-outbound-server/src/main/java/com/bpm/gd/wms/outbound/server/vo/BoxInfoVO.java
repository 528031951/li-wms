package com.bpm.gd.wms.outbound.server.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author Super Young
 * @Date 2020/8/14 15:14
 */
@Data
@ApiModel(description = "托盘中箱子详情")
public class BoxInfoVO {

    @ApiModelProperty(value = "成品编号")
    private String productCode;

    @ApiModelProperty(value = "成品箱条码")
    private String boxBarcode;

    @ApiModelProperty(value = "数量")
    private BigDecimal boxPackingQuantity;

    @ApiModelProperty(value = "箱子批次号")
    private String boxBatchNumber;

    @ApiModelProperty(value = "所属托盘编码")
    private String barcode;

}
