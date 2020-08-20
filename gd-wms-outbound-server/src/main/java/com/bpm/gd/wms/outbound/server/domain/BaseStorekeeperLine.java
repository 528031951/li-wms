package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

/**
 * 库管员和产线对应关系表
 */
@Data
public class BaseStorekeeperLine {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 库管员名字
     */
    private String storekeeperName;

    /**
     * 库管员id
     */
    private Long userId;

    /**
     * 产线名字
     */
    private String lineName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 区域
     */
    private String region;
}