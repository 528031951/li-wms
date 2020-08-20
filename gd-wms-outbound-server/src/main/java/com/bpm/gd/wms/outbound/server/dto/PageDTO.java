package com.bpm.gd.wms.outbound.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "分页")
public class PageDTO {

    @ApiModelProperty("当前页")
   private Integer  pageNum;

    @ApiModelProperty("末页")
   private Integer  pageSize;
}
