package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.util.Date;

/**
 * 用户表
 */
@Data
public class SysUser {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 姓名
     */
    private String name;

    /**
     * 电话
     */
    private String phone;

    /**
     * 部门id
     */
    private Long departmentId;

    /**
     * 状态（0-正常，1-停用）
     */
    private Long status;

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
     * 修改人id
     */
    private Long updaterId;

    /**
     * T100用户id
     */
    private String otherUserId;

    /**
     * 邮箱
     */
    private String mailbox;

    /**
     * 头像地址
     */
    private String avatarAddress;

    /**
     * 登陆标识（0-从未登录，1-至少登录过一次）
     */
    private Long identification;
}