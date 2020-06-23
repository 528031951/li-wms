package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

/**
 * 储位与物料的中间表
 */
@Data
public class BaseDepotToProduct {
    private String id;

    /**
     * 储位号
     */
    private String depotId;

    /**
     * 成品ID
     */
    private String matterId;

    /**
     * 库存数量
     */
    private Long allNumber;

    /**
     * 中储库的数量
     */
    private Long transferNumber;

    /**
     * 供应商编码
     */
    private String supplierCode;



    /**
     * 出货数量
     */
    private Long addOutNumber;
}