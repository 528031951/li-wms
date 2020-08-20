package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.util.Date;

/**
 * 工单补料表
 */
@Data
public class WorkOrderMaterialSupplement {
    private Integer id;

    /**
     * 工单编号
     */
    private String workOrderCode;

    /**
     * 产线编号
     */
    private String lineCode;

    /**
     * 产品编号
     */
    private String productCode;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 申请日期
     */
    private Date applicationTime;

    /**
     * 计划结束时间
     */
    private Date planEndTime;

    /**
     * 计划开始时间
     */
    private Date planStartTime;

    /**
     * 补料状态（0：新建，1：进行中，2：完成）
     */
    private Integer status;

    /**
     * 补料单号（做关联用）
     */
    private String supplementCode;

    /**
     * 区域
     */
    private String areaCode;
}