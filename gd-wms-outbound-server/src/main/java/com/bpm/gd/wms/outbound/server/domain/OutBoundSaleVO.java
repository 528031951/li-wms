package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 工单出库表
 */
@Data
public class OutBoundSaleVO {
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