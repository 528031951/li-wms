package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.BaseStorekeeperLine;
import com.bpm.gd.wms.outbound.server.domain.BaseStorekeeperLineExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseStorekeeperLineMapper {
    long countByExample(BaseStorekeeperLineExample example);

    int deleteByExample(BaseStorekeeperLineExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseStorekeeperLine record);

    int insertSelective(BaseStorekeeperLine record);

    List<BaseStorekeeperLine> selectByExample(BaseStorekeeperLineExample example);

    BaseStorekeeperLine selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseStorekeeperLine record, @Param("example") BaseStorekeeperLineExample example);

    int updateByExample(@Param("record") BaseStorekeeperLine record, @Param("example") BaseStorekeeperLineExample example);

    int updateByPrimaryKeySelective(BaseStorekeeperLine record);

    int updateByPrimaryKey(BaseStorekeeperLine record);
}