package com.bpm.gd.wms.outbound.server.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ApiModel(description = "成品批号对应物料信息")
public class WarehousingProductReceiptDTO {

    @ApiModelProperty("主键id")
    private Long id;

    @ApiModelProperty("储位编号")
    private String depotId;

    @ApiModelProperty("成品编号")
    private String productCode;

    @ApiModelProperty("产品名称")
    private String productName;

    @ApiModelProperty("箱号")
    private String boxNo;

    @ApiModelProperty("产品数量")
    private Long productNumber;

    @ApiModelProperty("供应商编码")
    private String supplierCode;

    @ApiModelProperty("供应商名称")
    private String supplierName;

    @ApiModelProperty("生产时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date productTime;

}