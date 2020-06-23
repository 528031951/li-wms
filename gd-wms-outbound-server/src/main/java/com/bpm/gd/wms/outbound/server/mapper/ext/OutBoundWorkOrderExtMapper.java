package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.MatterInfo;
import com.bpm.gd.wms.outbound.server.domain.OutBoundWorkOrder;
import com.bpm.gd.wms.outbound.server.domain.OutBoundWorkOrderExample;
import com.bpm.gd.wms.outbound.server.dto.QueryWorkOrderDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OutBoundWorkOrderExtMapper {
    List<OutBoundWorkOrder> findWorkOrder(QueryWorkOrderDTO queryWorkOrderDTO);

    long countByExample(OutBoundWorkOrderExample example);

    int deleteByExample(OutBoundWorkOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(OutBoundWorkOrder record);

    int insertSelective(OutBoundWorkOrder record);

    List<OutBoundWorkOrder> selectByExample(OutBoundWorkOrderExample example);

    OutBoundWorkOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OutBoundWorkOrder record, @Param("example") OutBoundWorkOrderExample example);

    int updateByExample(@Param("record") OutBoundWorkOrder record, @Param("example") OutBoundWorkOrderExample example);

    int updateByPrimaryKeySelective(OutBoundWorkOrder record);

    int updateByPrimaryKey(OutBoundWorkOrder record);

    int dispatchWorkOrder(List<String> ids);

    List<OutBoundWorkOrder> findTaskByUser(@Param("user") String user);

    List<OutBoundWorkOrder> findMatterByWorkOrder(@Param("workOrderId") String workOrderId, @Param("user") String name);

    List<OutBoundWorkOrder> findWorkOrderMatter(@Param("workOrderId") String workOrderId);

    List<OutBoundWorkOrder> findPositionById(@Param("workOrderId") String workOrderId, @Param("user") String name);

    List<OutBoundWorkOrder> findPositionByBill(@Param("workOrderId") String workOrderId,@Param("user") String name);
}