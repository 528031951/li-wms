package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 工单补料物料详情
 */
@Data
public class WorkOrderMaterialSupplementDetails {
    private Integer id;

    /**
     * 工单号
     */
    private String workOrderCode;

    /**
     * 物料编号
     */
    private String materielCode;

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
}