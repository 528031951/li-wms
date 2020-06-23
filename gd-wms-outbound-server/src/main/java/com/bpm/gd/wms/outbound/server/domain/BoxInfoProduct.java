package com.bpm.gd.wms.outbound.server.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class BoxInfoProduct {
    /**
     * ID
     */
    private String id;
    private String caseNo;
    private String depotId;
    private String matterId;
    private Long minPackageNumber;
    private Long allNumber;
    private Long transferNumber;
    private Date inTime;
    private String supplierCode;
    private String centralStorageCode;
    private Integer type;






}