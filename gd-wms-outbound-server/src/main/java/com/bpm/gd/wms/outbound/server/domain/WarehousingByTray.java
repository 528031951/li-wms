package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 成品入库表（扫描托盘入库）
 */
@Data
public class WarehousingByTray {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 托盘码
     */
    private String barcode;

    /**
     * 托盘批次号
     */
    private String trayBatchNumber;

    /**
     * 箱子数量
     */
    private BigDecimal trayBoxQuantity;

    /**
     * 托盘上产品数量
     */
    private BigDecimal trayQuantity;

    /**
     * 成品编码
     */
    private String productCode;

    /**
     * 成品名称
     */
    private String materialName;

    /**
     * 客户编码
     */
    private String signatureCode;

    /**
     * 客户名称
     */
    private String supplierName;

    /**
     * 工单号
     */
    private String workOrderCode;

    /**
     * 储位编号
     */
    private String storageNo;
}