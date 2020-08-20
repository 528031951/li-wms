package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 料废表
 */
@Data
public class HvGdMaterialWaste {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 工单id
     */
    private Integer workOrderId;

    /**
     * 物料编号
     */
    private String materielCode;

    /**
     * 物料批次编号
     */
    private String materielBatchCode;

    /**
     * 报废数量
     */
    private BigDecimal wasteNumber;

    /**
     * 状态    0-新建，1-已上报
     */
    private Integer status;

    /**
     * 工单号
     */
    private String workOrderCode;

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
}