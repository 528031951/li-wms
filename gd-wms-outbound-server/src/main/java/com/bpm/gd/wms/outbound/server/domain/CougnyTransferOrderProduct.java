package com.bpm.gd.wms.outbound.server.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 成品调拨单
 */
@Data
public class CougnyTransferOrderProduct {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 箱子编码
     */
    private String caseNo;

    /**
     * 箱子数量
     */
    private BigDecimal caseNum;

    /**
     * 成品编码
     */
    private String materialNo;

    /**
     * 成品名称
     */
    private String materialName;

    /**
     * 调入库房编码
     */
    private String inWarehouseCod;

    /**
     * 调入库房名称
     */
    private String inWarehouseName;

    /**
     * 调出库房编码
     */
    private String outWarehouseCod;

    /**
     * 调出库房名称
     */
    private String outWarehouseName;

    /**
     * 成品规格
     */
    private String productSpecifications;

    /**
     * 出通单号
     */
    private String shipmentNo;

    /**
     * 货物备注
     */
    private String shipmentRemarks;

    /**
     * 客户料号
     */
    private String customerMaterialNumber;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 客户编号
     */
    private String customerNo;

    /**
     * 出货性质
     */
    private String shipmentType;

    /**
     * 单位
     */
    private String productUnit;

    /**
     * 调拨时间
     */
    private Date cougnyTime;

    /**
     * 创建人id
     */
    private Long createId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 托盘编码
     */
    private String trayNo;
}