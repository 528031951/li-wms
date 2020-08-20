package com.bpm.gd.wms.outbound.server.dto;

import com.bpm.gd.wms.outbound.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "WEB端生产备料/生产补料条件查询对象")
public class QueryWorkOderWebDTO  extends PageDTO {

    @ApiModelProperty("工单编码")
    private String workOrderCodeId;

    @ApiModelProperty("工单状态")
    private String workOrderState;

    @ApiModelProperty("产线编码")
    private String areaCode ;

}
