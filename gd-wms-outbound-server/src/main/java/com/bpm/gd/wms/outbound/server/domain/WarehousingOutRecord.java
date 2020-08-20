package com.bpm.gd.wms.outbound.server.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 出库记录表
 */
@Data
@Accessors(chain = true)
public class WarehousingOutRecord {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 物料编号
     */
    private String materialNo;

    /**
     * 物料名称
     */
    private String materialName;

    /**
     * 供应商编号
     */
    private String supplierNo;

    /**
     * 供应商名称
     */
    private String supplierName;

    /**
     * 出库类型(1:生产备料  2:生产补料 3:成品出库)
     */
    private String warehousingOutType;

    /**
     * 储位编号
     */
    private String storageNo;

    /**
     * 出库时间
     */
    private Date warehousingOutTime;

    /**
     * 箱子编号(根据实际情况，可能有，可能没有)    托盘编号（成品出库时有）
     */
    private String boxNo;

    /**
     * 数量
     */
    private BigDecimal count;

    /**
     * 单位
     */
    private String unit;

    /**
     * 工单编号
     */
    private String orderNo;

    /**
     * 操作人id
     */
    private Long operatorId;

    /**
     * 状态（0：新建 1：提交）
     */
    private String status;

    /**
     * 产线编号
     */
    private String areaCode;
}