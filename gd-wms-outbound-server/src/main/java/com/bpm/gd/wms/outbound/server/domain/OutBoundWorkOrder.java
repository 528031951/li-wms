package com.bpm.gd.wms.outbound.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class OutBoundWorkOrder {
    /**
     * ID
     */
    private String id;

    /**
     * 工单ID
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
     * 物料名称
     */
    private String matterName;

    /**
     * 需求数量
     */
    private Long matterNumber;

    /**
     * 工单状态
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
     * 工单创建时间
     */
    private Date workOrderDate;


    private List<MatterInfo> children=new ArrayList<>();


    /**
     * 位置编码
     */
    private String depotId;
    /**
     * 库存数量
     */
    private Long allNumber;
    /**
     * 已经占用数量
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
     * 一个区域货架数量
     */
    private Integer oneAreaNumber=10;


    /**
     * 拣货状态
     */
    private String outStatus;


    /**
     * 拣货数量
     */
    private Long outNumber;


    /**
     * 位置A03----03
     */
    private String positionNumber;


    //20200611 变更：以箱子为单位；添加箱子相关属性。

    private Long realNumber;
    /**
     * 已经占用数量
     */
    //private Long inUseNumber;
    /**
     * 空闲数量
     */
    private Long freeNumber;
    /**
     * 打印日期
     */
    private Date printTime;
}