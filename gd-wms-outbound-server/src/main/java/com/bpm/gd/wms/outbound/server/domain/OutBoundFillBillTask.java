package com.bpm.gd.wms.outbound.server.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class OutBoundFillBillTask {
    /**
     * ID
     */
    private String id;


    /**
     * 调拨单ID
     */
    private String transferId;


    /**
     * 调拨单状态
     */
    private Long transferStatus;

    /**
     * 调拨目标库位
     */
    private String targetDepot;
    /**
     * 补料单号
     */
    private String fillBillId;


    /**
     * 销售单号
     */
    private String saleId;

    /**
     * 工单号
     */
    private String workOrderId;
    /**
     * 产线
     */
    private String workLine;

    /**
     * 物料ID
     */
    private String matterNo;

    /**
     * 需求数量
     */
    private Long matterNumber;

    /**
     * 补料单状态
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
     * 物料型号
     */
    private String matterSpec;

    /**
     * 物料名称
     */
    private String matterName;

    /**
     * 单据创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date billDate;



    /**
     * 创建时间
     */

    private Date createDate;



    /**
     * 工单创建时间
     */

    private Date workOrderDate;

    /**
     * 储位ID
     */
    private String depotId;

    /**
     * 捡货状态
     */
    private String outStatus;

    /**
     * 实际拣货数量
     */
    private Long outNumber;

    /**
     * 库存数量
     */
    private Long allNumber;

    /**
     * 暂用数量
     */
    private Long inUseNumber;

    /**
     * 空闲数量
     */
    private Long outUseNumber;

    /**
     * 新增占用数量
     */
    private Long addUseNumber;

    /**
     * 一个区域的货架个数
     */
    private Long oneAreaNumber;



    /**
     * 位置A03----03
     */
    private String positionNumber;


    /**
     * 调拨单创建时间
     */

    private Date transferDate;
}