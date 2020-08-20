package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 储位的余料信息
 */
@Data
public class StorageRemainMaterial {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 储位编号
     */
    private String storageLocationCode;

    /**
     * 物料编号
     */
    private String materialCode;

    /**
     * 物料名称
     */
    private String materialName;

    /**
     * 批号
     */
    private String batchNumber;

    /**
     * 数量
     */
    private BigDecimal quantity;

    /**
     * 规格
     */
    private String specification;

    /**
     * 供应商编号
     */
    private String supplierCode;

    /**
     * 供应商名称
     */
    private String supplierName;

    /**
     * 单位
     */
    private String unit;

    /**
     * 箱子序列号/小包装序列号
     */
    private String boxCode;
}