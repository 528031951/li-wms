package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.WarehousingFrozen;
import com.bpm.gd.wms.outbound.server.domain.WarehousingFrozenExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehousingFrozenMapper {
    long countByExample(WarehousingFrozenExample example);

    int deleteByExample(WarehousingFrozenExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WarehousingFrozen record);

    int insertSelective(WarehousingFrozen record);

    List<WarehousingFrozen> selectByExample(WarehousingFrozenExample example);

    WarehousingFrozen selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WarehousingFrozen record, @Param("example") WarehousingFrozenExample example);

    int updateByExample(@Param("record") WarehousingFrozen record, @Param("example") WarehousingFrozenExample example);

    int updateByPrimaryKeySelective(WarehousingFrozen record);

    int updateByPrimaryKey(WarehousingFrozen record);
}