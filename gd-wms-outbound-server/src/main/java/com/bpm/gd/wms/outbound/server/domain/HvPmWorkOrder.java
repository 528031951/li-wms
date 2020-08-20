package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class HvPmWorkOrder {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人id
     */
    private Long creatorId;

    private String siteNum;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人id
     */
    private Long updaterId;

    /**
     * 实际产量
     */
    private BigDecimal actualCount;

    /**
     * 实际结束时间
     */
    private Date actualEndTime;

    /**
     * 实际开始时间
     */
    private Date actualStartTime;

    /**
     * 产线id
     */
    private Long areaId;

    /**
     * BOM id
     */
    private Long bomId;

    /**
     * BOM版本号
     */
    private String bomVersion;

    /**
     * 车间id
     */
    private Long cellId;

    /**
     * 组id
     */
    private Long crewId;

    /**
     * 组名
     */
    private String crewName;

    /**
     * 特征值
     */
    private String eigenvalue;

    /**
     * 发布时间
     */
    private Date issuedTime;

    /**
     * 生产物料编码
     */
    private String materialCode;

    /**
     * 物料id
     */
    private Long materialId;

    /**
     * 生产物料名称
     */
    private String materialName;

    /**
     * 计划编号
     */
    private String planCode;

    /**
     * 计划结束时间
     */
    private Date planEndTime;

    /**
     * 计划开始时间
     */
    private Date planStartTime;

    /**
     * 生产数量
     */
    private BigDecimal quantity;

    /**
     * 路由编码
     */
    private String routeCode;

    /**
     * 路由id
     */
    private Long routeId;

    /**
     * 路由名称
     */
    private String routeName;

    /**
     * 路由版本号
     */
    private String routeVersion;

    /**
     * 序列号
     */
    private Long serialNumber;

    /**
     * 班次id
     */
    private Long shiftId;

    /**
     * 班次名称
     */
    private String shiftName;

    /**
     * 工单号
     */
    private String workOrderCode;

    /**
     * 工单状态(0:新建，1：下发，2：捡料中，3：捡料完成，5：完成)
     */
    private Integer workOrderState;

    /**
     * bom结构
     */
    private String bom;

    /**
     * 客户编号
     */
    private String customerNo;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 产线名称
     */
    private String areaName;

    /**
     * 产线编号
     */
    private String areaCode;

    /**
     * 生产物料单位
     */
    private String workUnit;

    /**
     * 单据日期
     */
    private Date orderTime;

    /**
     * 生管人员
     */
    private String managementUser;

    /**
     * 工单类型
     */
    private String workOrderType;

    /**
     * 生产批次
     */
    private String productionBatch;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 客户料号
     */
    private String customerMaterialCode;

    /**
     * 生产物料规格
     */
    private String materialSpec;
}