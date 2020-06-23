package com.bpm.gd.wms.outbound.server.dto;

import com.bpm.gd.wms.outbound.common.dto.PageDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ApiModel(description = "成品查询对象")
public class QueryProductDTO extends PageDTO {

    @ApiModelProperty("成品id")
    private String productId;

    @ApiModelProperty("出货数量")
    private Long outNumber;

    @ApiModelProperty("开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;


    @ApiModelProperty("结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;


}
