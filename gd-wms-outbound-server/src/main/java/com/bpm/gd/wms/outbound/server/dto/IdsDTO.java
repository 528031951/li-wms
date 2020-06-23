package com.bpm.gd.wms.outbound.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(description = "ids对象")
public class IdsDTO  {

    @ApiModelProperty("ids")
    private List<String> ids;


}
