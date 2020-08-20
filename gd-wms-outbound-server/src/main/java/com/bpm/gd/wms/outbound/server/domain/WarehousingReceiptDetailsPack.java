package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 箱内包装表
 */
@Data
public class WarehousingReceiptDetailsPack {
    private Long id;

    /**
     * 箱号
     */
    private String boxNo;

    /**
     * 内包装编号
     */
    private String packNo;

    /**
     * 物料数量
     */
    private BigDecimal materialNumber;

    /**
     * 合格数量
     */
    private BigDecimal materialNumberQua;

    /**
     * 不合格数量
     */
    private BigDecimal materialNumberNotqua;

    private Date createTime;

    private Date updateTime;

    private Long creatorId;

    private Long updaterId;

    /**
     * 是否出库 0：未出库，1：已出库
     */
    private Integer isBound;
}