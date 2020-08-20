package com.bpm.gd.wms.outbound.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author Super Young
 * @Date 2020/8/17 10:37
 */
@Data
@ApiModel(description = "成品出库对象")
public class ProductOutBoundDTO {

    @ApiModelProperty(value = "储位编码")
    private String storageNo;

    @ApiModelProperty(value = "被扫描的编码")
    private String trayNo;

    @ApiModelProperty(value = "出通单号")
    private String outOrderCode;


}
