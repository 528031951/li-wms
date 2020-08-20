package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class BaseDepotToMatter {
    private String id;

    private String depotId;

    private String matterId;

    private BigDecimal allNumber;

    private Long inUseNumber;

    private Long outUseNumber;


    private String matterName;


    private String matterSpec;

}