package com.bpm.gd.wms.outbound.server.domain;

import java.util.Date;
import lombok.Data;

/**
 * 工单出库表
 */
@Data
public class OutBoundSale {
    /**
     * ID
     */
    private String id;

    /**
     * 销售单ID
     */
    private String saleId;

    /**
     * 产线
     */
    private String workLine;

    /**
     * 销售单状态
     */
    private String status;

    /**
     * 任务负责人ID
     */
    private String taskLeaderId;

    /**
     * 任务状态
     */
    private String taskStatus;

    /**
     * 销售单创建时间
     */
    private Date createDate;


    /**
     * 物料ID
     */
    private String matterNo;

    /**
     * 物料名称
     */
    private String matterName;

    /**
     * 物料规格
     */
    private String matterSpec;

    /**
     * 物料数量
     */
    private Long matterNumber;



}