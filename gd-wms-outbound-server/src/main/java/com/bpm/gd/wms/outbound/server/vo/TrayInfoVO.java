package com.bpm.gd.wms.outbound.server.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author Super Young
 * @Date 2020/8/19 16:33
 */
@Data
@ApiModel(description = "扫描所得信息")
public class TrayInfoVO {

    @ApiModelProperty(value = "成品编码")
    private String productCode;

    @ApiModelProperty(value = "成品名称")
    private String productName;

    @ApiModelProperty(value = "数量")
    private String shipmentNumber;

    @ApiModelProperty(value = "已出货数量")
    private String realNumbers;

    @ApiModelProperty(value = "待出货数量")
    private String waitNumbers;

    @ApiModelProperty(value = "储位编号")
    private String storageNo;
}
