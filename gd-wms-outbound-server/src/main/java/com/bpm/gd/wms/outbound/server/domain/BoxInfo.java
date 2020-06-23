package com.bpm.gd.wms.outbound.server.domain;

import com.sun.xml.internal.bind.v2.model.core.ID;
import lombok.Data;

@Data
public class BoxInfo {
    /**
     * ID
     */
    private String id;

    private String caseNo;
    private String depotId;
    private String matterId;
    private Long minPackageNumber;
    private Long realNumber;
    private Integer type;






}