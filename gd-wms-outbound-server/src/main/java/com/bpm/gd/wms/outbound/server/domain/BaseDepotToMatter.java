package com.bpm.gd.wms.outbound.server.domain;

import lombok.Data;

import java.util.List;

@Data
public class BaseDepotToMatter {
    private String id;

    private String depotId;

    private String matterId;

    private Long allNumber;

    private Long inUseNumber;

    private Long outUseNumber;


    private String matterName;


    private String matterSpec;

}