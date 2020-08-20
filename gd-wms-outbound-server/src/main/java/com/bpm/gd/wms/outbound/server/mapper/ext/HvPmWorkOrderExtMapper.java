package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.HvPmWorkOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HvPmWorkOrderExtMapper {

    List<HvPmWorkOrder> selectWorkOrderListByUserId(Integer userId);

    /**
     * 根据工单编号查询工单ID
     * @param workOrderCode
     * @return
     */
    Integer selectIdByWorkOrderCode(@Param("workOrderCode") String workOrderCode);

    /**
     * 根据工单编号查询工单信息
     * @param workOrderCode
     * @return
     */
    HvPmWorkOrder selectByWorkOrderCode(@Param("workOrderCode") String workOrderCode);

    /**
     * 查询所有工单信息
     * @param workOrderCodeId  工单编码
     * @param workOrderState   工单状态
     * @param areaCode  产线编码
     * @return
     */
    List<HvPmWorkOrder> selectWorkOrderListAll(@Param("workOrderCodeId") String workOrderCodeId, @Param("workOrderState") String workOrderState, @Param("areaCode") String areaCode);

    /**
     * 根据工单号查询工单是否存在
     * @param workCode 工单号
     * @return
     */
    HvPmWorkOrder selectByOrderCode(String workCode);
}
