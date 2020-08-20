package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.util.Date;

@Data
public class BaseSupplierInformation {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 企业编号
     */
    private Long enterpriseNumber;

    /**
     * 供应商编码
     */
    private String supplierCode;

    /**
     * 供应商全名
     */
    private String supplierName;

    /**
     * 供应商简称
     */
    private String supplierAbbreviation;

    /**
     * 采购人员
     */
    private String buyerId;

    /**
     * 结账方式
     */
    private String paymentMethod;

    /**
     * 供应商经营形态
     */
    private String supplierOperationType;

    /**
     * 开户行
     */
    private String openingBank;

    /**
     * 银行账户
     */
    private String bankAccount;

    /**
     * 邀约状态 0-待邀约，1-已邀约
     */
    private Long inviteStatus;

    /**
     * 审核状态 0-待审核，1-已审核，2-审核失败
     */
    private Long auditStatus;

    /**
     * 加入时间
     */
    private String joinDate;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建人id
     */
    private Long creatorId;

    /**
     * 更新人id
     */
    private Long updaterId;

    /**
     * 税号
     */
    private String dutyParagraph;

    /**
     * 联络方式（电话）
     */
    private String contactPhone;

    /**
     * 联络地址
     */
    private String contactAddress;

    /**
     * 供应商类型 1.供应商,2.客户,3.交易对象
     */
    private String supplierType;

    /**
     * 供应商类型
     */
    private Long  property;
}