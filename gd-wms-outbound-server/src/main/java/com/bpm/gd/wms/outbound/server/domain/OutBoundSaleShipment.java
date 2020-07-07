package com.bpm.gd.wms.outbound.server.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 销售出库单（出通单）
 */
@Data
public class OutBoundSaleShipment {
    /**
     * 出通单号
     */
    private String shipmentNo;

    /**
     * 单据状态
     */
    private String shipmentStatus;

    /**
     * 客户编号
     */
    private String customerId;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 出货性质
     */
    private String shipmentType;

    /**
     * 出货备注
     */
    private String shipmentRemarks;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date establishDate;
}