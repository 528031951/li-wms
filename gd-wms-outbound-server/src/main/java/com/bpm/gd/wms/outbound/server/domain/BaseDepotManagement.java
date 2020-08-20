package com.bpm.gd.wms.outbound.server.domain;

import java.util.Date;
import lombok.Data;

/**
 * 库房/储位管理
 */
@Data
public class BaseDepotManagement {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 序号
     */
    private Long serialNumber;

    /**
     * 库存/储位名字
     */
    private String storageLocationName;

    /**
     * 储位编码
     */
    private String storageLocationCod;

    /**
     * 父级id
     */
    private Long parentId;

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
     * 盒子数量
     */
    private Long boxNumber;

    /**
     * 库位级别
     */
    private String grade;

    /**
     * 仓库类型（1:物料库 2:成品库 3:中储库）
     */
    private String depotType;
}