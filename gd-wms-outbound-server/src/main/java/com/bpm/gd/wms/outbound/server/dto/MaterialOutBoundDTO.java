package com.bpm.gd.wms.outbound.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author Super Young
 * @Date 2020/8/5 18:59
 */
@Data
@ApiModel(description = "领料出库对象")
public class MaterialOutBoundDTO {

    @ApiModelProperty(value = "单头")
    private OrderHead orderHead;

    @ApiModelProperty(value = "单身")
    private List<OrderBody> list;

}
