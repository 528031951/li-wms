package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.util.List;

@Data
public class MatterInfo {
    /**
     * ID
     */
    private String matterId;

    /**
     * 物料名称
     */
    private String matterName;

    /**
     * 物料规格
     */
    private String matterSpec;

    /**
     * 需求数量
     */
    private Long matterNumber;


}