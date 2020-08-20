package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.BaseHighLevelRack;
import com.bpm.gd.wms.outbound.server.domain.BaseHighLevelRackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseHighLevelRackMapper {
    long countByExample(BaseHighLevelRackExample example);

    int deleteByExample(BaseHighLevelRackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseHighLevelRack record);

    int insertSelective(BaseHighLevelRack record);

    List<BaseHighLevelRack> selectByExample(BaseHighLevelRackExample example);

    BaseHighLevelRack selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseHighLevelRack record, @Param("example") BaseHighLevelRackExample example);

    int updateByExample(@Param("record") BaseHighLevelRack record, @Param("example") BaseHighLevelRackExample example);

    int updateByPrimaryKeySelective(BaseHighLevelRack record);

    int updateByPrimaryKey(BaseHighLevelRack record);
}