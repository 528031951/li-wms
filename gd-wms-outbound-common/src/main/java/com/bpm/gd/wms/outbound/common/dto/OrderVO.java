package com.bpm.gd.wms.outbound.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/***
 * @ClassName: OrderDTO
 * @Description: TODO
 * @Auther:chenyiwen
 * @Date: 2020/6/2 14:32
 * @version : V1.0
 */
@Data
@ApiModel(description = "送货单对象")
public class OrderVO {

    @ApiModelProperty("送货单编号")
    private String code;


}
