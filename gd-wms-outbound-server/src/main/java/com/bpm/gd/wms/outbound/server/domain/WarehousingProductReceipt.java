package com.bpm.gd.wms.outbound.server.domain;

import java.util.Date;
import lombok.Data;

@Data
public class WarehousingProductReceipt {
    private Long id;

    private String depotId;

    private String productCode;

    private String productName;

    private String boxNo;

    private Long productNumber;

    private String supplierCode;

    private String supplierName;

    private Date productTime;

    private String bak1;

    private String bak2;

    private String bak3;

    private String bak4;

    private String bak5;

    private String bak6;

    private Date createTime;

    private Date updateTime;

    private Long creatorId;

    private Long updaterId;
}