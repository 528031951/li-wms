package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.util.Date;

/**
 * 物料出库冻结
 */
@Data
public class WarehousingFrozen {
    private Long id;

    /**
     * 物料编码
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
     * 供应商编码
     */
    private String supplierCode;

    /**
     * 物料批号
     */
    private String materialBatchNumber;

    /**
     * 储位号
     */
    private String depotId;

    /**
     * 单位
     */
    private String baseUnit;

    /**
     * 物料记录数量
     */
    private Long materialRecordNumber;

    /**
     * 物料实际数量
     */
    private Long materialRealNumber;

    /**
     * 冻结类型：1：数量差异，2：质量问题
     */
    private Long frozenType;

    /**
     * 备注
     */
    private String remark;

    private Long creatorId;

    private Long updaterId;

    private Date createTime;

    private Date updateTime;

    /**
     * 箱号
     */
    private String boxNo;

    /**
     * 是否解冻，0：未解冻，1：已解冻
     */
    private Long isFrozen;
}