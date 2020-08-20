package com.bpm.gd.wms.outbound.server.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class WorkOrderMaterialSupplementDetailsVO {

    private Integer id;

    /**
     * 工单号
     */
    private String workOrderCode;

    /**
     * 工单ID
     */
    private Integer workOrderId;

    /**
     * 物料编号
     */
    private String materielCode;

    /**
     * 物料名称
     */
    private String materielName;

    /**
     * 储位编号
     */
    private String storageCode;

    /**
     * 储位名称
     */
    private String storageName;
    /**
     * 物料批次编号
     */
    private String materielBatchCode;

    /**
     * 需求数量
     */
    private BigDecimal needNumber;

    /**
     * 已送数量
     */
    private BigDecimal sendNumber;

    /**
     * 0：工废，1：料废，2：联代报废
     */
    private Integer wasteType;

    /**
     * 物料单位
     */
    private String materielUnit;

    /**
     * 产品特征（供应商）
     */
    private String eigenvalue;

    /**
     * 产品编号
     */
    private String productCode;

    /**
     * 拣货状态（0：未完成，1：已完成）
     */
    private Integer status;

    /**
     * 补料单号（做关联用）
     */
    private String supplementCode;

    @ApiModelProperty("拣货数量")
    private BigDecimal quantity;

    @ApiModelProperty("类型：0：外包装，1：内包装，2：余料")
    private Integer type;

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

    @ApiModelProperty("生产物料规格")
    private String materialSpec;
}
