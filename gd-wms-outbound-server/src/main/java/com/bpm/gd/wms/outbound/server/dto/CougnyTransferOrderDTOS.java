package com.bpm.gd.wms.outbound.server.dto;

import com.bpm.gd.wms.outbound.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(description = "调拨单")
public class CougnyTransferOrderDTOS extends PageDTO {

    @ApiModelProperty("调拨单")
    private List<CougnyTransferOrderDTO> cougnyTransferOrderDTOS;

}