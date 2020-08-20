package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.util.Date;

/**
 * 入库记录表
 */
@Data
public class WarehousingRecord {
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
     * 供应商名称
     */
    private String supplierName;

    /**
     * 供应商编号
     */
    private String supplierNo;

    /**
     * 入库类型(1:物料上架 2:余料退库 3:生产退料 4：成品入库)
     */
    private String warehousingType;

    /**
     * 储位编号
     */
    private String storageNo;

    /**
     * 入库时间
     */
    private Date warehousingTime;

    /**
     * 箱子编号（根据实际情况，可能有，可能没有）
     */
    private String boxNo;

    /**
     * 数量
     */
    private Long materialNumber;

    /**
     * 单位
     */
    private String unit;

    /**
     * 操作人id
     */
    private String operatorId;

    /**
     * 托盘号（托盘上架时保存）
     */
    private String palletNo;
}