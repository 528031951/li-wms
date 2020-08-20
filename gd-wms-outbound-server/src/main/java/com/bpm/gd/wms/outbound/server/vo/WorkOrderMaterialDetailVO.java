package com.bpm.gd.wms.outbound.server.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel(description = "工单物料扫描详情VO")
public class WorkOrderMaterialDetailVO {

    @ApiModelProperty("主键ID")
    private Integer id;

    @ApiModelProperty("发料料号")
    private String materialItemNo;

    @ApiModelProperty("发料品名")
    private String materialNo;

    @ApiModelProperty("发料规格")
    private String materialSpec;

    @ApiModelProperty("产品特征（供应商）")
    private String eigenvalue;

    @ApiModelProperty("单位")
    private String unit;

    @ApiModelProperty("应发数量（WMS）")
    private BigDecimal issuedQuantity;

    @ApiModelProperty("已发数量（WMS）")
    private BigDecimal sendQuantity;

    @ApiModelProperty("工单ID")
    private Integer workOrderId;

    @ApiModelProperty("工单编号")
    private String workOrderCode;

    /**新增的**/

    @ApiModelProperty("储位编号")
    private String storageCode;

    @ApiModelProperty("储位名称")
    private String storageName;

    @ApiModelProperty("类型：0：外包装，1：内包装，2：余料")
    private Integer type;

    @ApiModelProperty("需拣数量")
    private BigDecimal needQuantity;

    @ApiModelProperty("拣货数量")
    private BigDecimal quantity;

    @ApiModelProperty("供应商名称")
    private String supplierName;

    @ApiModelProperty("供应商属性")
    private Long supplierType;

    @ApiModelProperty("箱号")
    private String caseNumber;

    @ApiModelProperty("批号")
    private String batchNumber;

    @ApiModelProperty("箱子编码")
    private String caseNo;


}
