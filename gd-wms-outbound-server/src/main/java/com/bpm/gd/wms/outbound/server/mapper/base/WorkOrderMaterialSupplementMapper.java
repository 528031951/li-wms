package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.WorkOrderMaterialSupplement;
import com.bpm.gd.wms.outbound.server.domain.WorkOrderMaterialSupplementExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkOrderMaterialSupplementMapper {
    long countByExample(WorkOrderMaterialSupplementExample example);

    int deleteByExample(WorkOrderMaterialSupplementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkOrderMaterialSupplement record);

    int insertSelective(WorkOrderMaterialSupplement record);

    List<WorkOrderMaterialSupplement> selectByExample(WorkOrderMaterialSupplementExample example);

    WorkOrderMaterialSupplement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkOrderMaterialSupplement record, @Param("example") WorkOrderMaterialSupplementExample example);

    int updateByExample(@Param("record") WorkOrderMaterialSupplement record, @Param("example") WorkOrderMaterialSupplementExample example);

    int updateByPrimaryKeySelective(WorkOrderMaterialSupplement record);

    int updateByPrimaryKey(WorkOrderMaterialSupplement record);

    /**
     * 根据用户ID查询库管员负责的补料任务
     * @param userId
     * @return
     */
    List<WorkOrderMaterialSupplement> selectByUserId(@Param("userId") Integer userId);

    /**
     * 根据补料单号查询工单补料单信息
     * @param supplementCode
     * @return
     */
    WorkOrderMaterialSupplement selectBySupplementCode(@Param("supplementCode") String supplementCode);



}