package com.bpm.gd.wms.outbound.server.dto;

import com.bpm.gd.wms.outbound.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "调拨单")
public class CougnyTransferOrderDTO extends PageDTO {
    /**
     * 主键id
     */
    @ApiModelProperty("主键id")
    private Long id;

    /**
     * 物料id
     */
    @ApiModelProperty("物料id")
    private String materialCode;

    /**
     * 物料名称
     */
    @ApiModelProperty("物料名称")
    private String materialName;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 用户id
     */
    @ApiModelProperty("用户id")
    private Integer userId;

    /**
     * 用户名称
     */
    @ApiModelProperty("用户名称")
    private String userName;

    /**
     * 流利架名称
     */
    @ApiModelProperty("流利架名称")
    private String lowLocationName;

    /**
     * 流利架id
     */
    @ApiModelProperty("流利架id")
    private String lowLocationCod;

    /**
     * 高位架id
     */
    @ApiModelProperty("高位架id")
    private String highLocationCod;

    /**
     * 高位架名称
     */
    @ApiModelProperty("高位架名称")
    private String highLocationName;

    /**
     * 数量
     */
    @ApiModelProperty("数量")
    private Long dbNumber;

    /**
     * 调出库房
     */
    @ApiModelProperty("调出库房")
    private String takeOutWarehouse;

    /**
     * 调入库房
     */
    @ApiModelProperty("调入库房")
    private String putInWarehouse;

    /**
     * 成品规格
     */
    @ApiModelProperty("成品规格")
    private String productSpecifications;

    /**
     * 出通单号
     */
    @ApiModelProperty("出通单号")
    private String shipmentNo;

    /**
     * 客户料号
     */
    @ApiModelProperty("客户料号")
    private String customerMaterialNumber;

    /**
     * 客户名称
     */
    @ApiModelProperty("客户名称")
    private String customerName;

    /**
     * 货物备注
     */
    @ApiModelProperty("货物备注")
    private String shipmentRemarks;

    /**
     * 出货性质
     */
    @ApiModelProperty("出货性质")
    private String shipmentType;

    /**
     * 客户编号
     */
    @ApiModelProperty("客户编号")
    private String customerId;

    /**
     * 单位
     */
    @ApiModelProperty("单位")
    private String productUnit;
}