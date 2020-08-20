package com.bpm.gd.wms.outbound.server.domain;

import java.util.Date;
import lombok.Data;

/**
 * 销售出库单详情（出通单详情）
 */
@Data
public class OutBoundSaleShipmentDetails {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 出通单号
     */
    private String shipmentNo;

    /**
     * 成品名称
     */
    private String productName;

    /**
     * 成品编号
     */
    private String productId;

    /**
     * 出货数量
     */
    private Long shipmentNumber;

    /**
     * 单位
     */
    private String productUnit;

    /**
     * 库位名称
     */
    private String storageLocationName;

    /**
     * 库位编号
     */
    private String storageLocationCod;

    /**
     * 已出货数量
     */
    private Long alreadyShipmentNumber;

    /**
     * 出货详情状态 1.未完成 2.已完成
     */
    private String shipmentDetailsStatus;

    private Date createTime;

    private Date updateTime;

    private Long creatorId;

    private Long updaterId;

    /**
     * 成品规格
     */
    private String productSpecifications;

    /**
     * 客户料号
     */
    private String customerMaterialNumber;
}