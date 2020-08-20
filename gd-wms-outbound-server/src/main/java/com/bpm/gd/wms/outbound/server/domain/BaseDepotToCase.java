package com.bpm.gd.wms.outbound.server.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 储位与箱子的中间表（储位上存放了哪些箱子）
 */
@Data
public class BaseDepotToCase {
    private String id;

    /**
     * 储位号
     */
    private String depotId;

    /**
     * 物料ID
     */
    private String matterId;

    /**
     * 箱子编码
     */
    private String caseNo;

    /**
     * 箱子最大存放数量(弃用)
     */
    private Long maxNumber;

    /**
     * 箱子真实存放数量
     */
    private BigDecimal realNumber;

    /**
     * 打印日期（用于先进先出）
     */
    private Date printTime;

    /**
     * 被占用数量（弃用）
     */
    private Long inUseNumber;

    /**
     * 空余数量（弃用）
     */
    private Long freeNumber;

    /**
     * 状态（是否失效）（弃用）
     */
    private String status;

    /**
     * 最小包装数（弃用）
     */
    private Long minPackageNumber;

    /**
     * 是否为成品（默认为0，非成品；1为成品）
     */
    private Long product;
}