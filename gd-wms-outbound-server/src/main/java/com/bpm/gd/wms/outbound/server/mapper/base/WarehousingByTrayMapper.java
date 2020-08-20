package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.WarehousingByTray;
import com.bpm.gd.wms.outbound.server.domain.WarehousingByTrayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehousingByTrayMapper {
    long countByExample(WarehousingByTrayExample example);

    int deleteByExample(WarehousingByTrayExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WarehousingByTray record);

    int insertSelective(WarehousingByTray record);

    List<WarehousingByTray> selectByExample(WarehousingByTrayExample example);

    WarehousingByTray selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WarehousingByTray record, @Param("example") WarehousingByTrayExample example);

    int updateByExample(@Param("record") WarehousingByTray record, @Param("example") WarehousingByTrayExample example);

    int updateByPrimaryKeySelective(WarehousingByTray record);

    int updateByPrimaryKey(WarehousingByTray record);
}