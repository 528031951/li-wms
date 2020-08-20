package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 工单物料清单
 */
@Data
public class HvGdWorkBom {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * BOM料号（暂不用）
     */
    private String bomItemNo;

    /**
     * 产品品名（暂不用）
     */
    private String mainMaterialNo;

    /**
     * 产品规格（暂不用）
     */
    private String mainMaterialSpec;

    /**
     * 发料料号
     */
    private String materialItemNo;

    /**
     * 发料品名
     */
    private String materialNo;

    /**
     * 发料规格
     */
    private String materialSpec;

    /**
     * 产品特征（供应商）
     */
    private String eigenvalue;

    /**
     * 单位
     */
    private String unit;

    /**
     * 应发数量（WMS）/应收数量（MES）
     */
    private BigDecimal issuedQuantity;

    /**
     * 已发数量（WMS）
     */
    private BigDecimal sendQuantity;

    /**
     * 已收数量（MES）
     */
    private BigDecimal receiveQuantity;

    /**
     * 在WMS中，该状态表示物料是否捡料完毕
     */
    private Integer receiveState;

    /**
     * 确认时间
     */
    private Date confirmTime;

    /**
     * 工单ID
     */
    private Integer orderId;

    /**
     * 工单编号
     */
    private String workOrderCode;
}