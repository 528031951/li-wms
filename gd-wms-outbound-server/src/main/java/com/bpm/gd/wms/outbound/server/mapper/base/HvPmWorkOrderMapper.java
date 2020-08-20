package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.HvPmWorkOrder;
import com.bpm.gd.wms.outbound.server.domain.HvPmWorkOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HvPmWorkOrderMapper {
    long countByExample(HvPmWorkOrderExample example);

    int deleteByExample(HvPmWorkOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HvPmWorkOrder record);

    int insertSelective(HvPmWorkOrder record);

    List<HvPmWorkOrder> selectByExample(HvPmWorkOrderExample example);

    HvPmWorkOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HvPmWorkOrder record, @Param("example") HvPmWorkOrderExample example);

    int updateByExample(@Param("record") HvPmWorkOrder record, @Param("example") HvPmWorkOrderExample example);

    int updateByPrimaryKeySelective(HvPmWorkOrder record);

    int updateByPrimaryKey(HvPmWorkOrder record);
}