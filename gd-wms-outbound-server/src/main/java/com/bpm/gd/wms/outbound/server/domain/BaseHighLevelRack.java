package com.bpm.gd.wms.outbound.server.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 高位货架
 */
@Data
public class BaseHighLevelRack {
    /**
     * ID
     */
    private Long id;

    /**
     * 储位编码
     */
    private String storageLocationCod;

    /**
     * 长
     */
    private BigDecimal storageLocationLong;

    /**
     * 宽
     */
    private BigDecimal storageLocationWide;

    /**
     * 高
     */
    private BigDecimal storageLocationHigh;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Long creatorId;

    /**
     * 修改人
     */
    private Long updaterId;

    /**
     * 最高载重量
     */
    private BigDecimal peakLoad;

    /**
     * 采购订单类型（1.vmi 2.非vmi 3.客供 4.样件）
     */
    private Long purchaseOrderType;

    /**
     * 最高库存
     */
    private BigDecimal theHighestInventory;

    /**
     * 最低库存
     */
    private BigDecimal minimumStockQuantity;

    /**
     * 安全库存
     */
    private BigDecimal safetyStock;

    /**
     * 能存放物料名称
     */
    private String materialName;

    /**
     * 对应关系，0-一对一（默认），1-一对
     */
    private Long congruentRelationship;

    /**
     * 供应商编码
     */
    private String supplierCode;

    /**
     * 物料编码
     */
    private String materialCode;

    /**
     * BASE_DEPOT_MANAGEMENT的主键id
     */
    private Long treeId;

    /**
     * 储位序号
     */
    private String storageLocationNo;

    /**
     * 所在货架类型 A:流利架 B:高位架 C:地面
     */
    private String shelvesType;
}