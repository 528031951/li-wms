package com.bpm.gd.wms.outbound.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(description = "添加调货单List")
public class CougnyTransferOrdersDTO {

    @ApiModelProperty("成品批号对应物料信息")
    private List<AddCougnyTransferOrderDTO> addCougnyTransferOrderDTOList;

}
