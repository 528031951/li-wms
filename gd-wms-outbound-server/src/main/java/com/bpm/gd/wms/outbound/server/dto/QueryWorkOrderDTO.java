package com.bpm.gd.wms.outbound.server.dto;

import com.bpm.gd.wms.outbound.common.dto.PageDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ApiModel(description = "工单查询对象")
public class QueryWorkOrderDTO extends PageDTO {

    @ApiModelProperty("工单id")
    private String workOrderId;


    @ApiModelProperty("开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;


    @ApiModelProperty("结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;



    @ApiModelProperty("派发类型(全部，已派发，未派发)")
    private String dispachType;


}
