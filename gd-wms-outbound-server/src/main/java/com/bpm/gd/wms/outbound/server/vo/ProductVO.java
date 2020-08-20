package com.bpm.gd.wms.outbound.server.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author Super Young
 * @Date 2020/8/12 15:30
 */
@Data
@ApiModel(description = "成品信息")
public class ProductVO {

    @ApiModelProperty(value = "工单编号")
    private String workOrderCode;

    @ApiModelProperty(value = "托盘条码")
    private String barcode;

    @ApiModelProperty(value = "托盘批次号")
    private String trayBatchNumber;

    @ApiModelProperty(value = "托盘上产品数量")
    private Long trayQuantity;

    @ApiModelProperty(value = "托盘上箱子数量")
    private Long trayBoxQuantity;

    @ApiModelProperty(value = "客户编码")
    private String signatureCode;

    @ApiModelProperty(value = "客户名称")
    private String supplierName;

    @ApiModelProperty(value = "成品编码")
    private String productCode;

    @ApiModelProperty(value = "成品名称")
    private String materialName;

    @ApiModelProperty(value = "储位编号")
    private String depotId;

    @ApiModelProperty(value = "托盘上箱子信息集合")
    private List<BoxInfoVO> list;
}
