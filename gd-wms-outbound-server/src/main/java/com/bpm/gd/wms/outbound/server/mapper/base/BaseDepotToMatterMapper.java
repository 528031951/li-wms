package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.BaseDepotToMatter;
import com.bpm.gd.wms.outbound.server.domain.BaseDepotToMatterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseDepotToMatterMapper {
    long countByExample(BaseDepotToMatterExample example);

    int deleteByExample(BaseDepotToMatterExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseDepotToMatter record);

    int insertSelective(BaseDepotToMatter record);

    List<BaseDepotToMatter> selectByExample(BaseDepotToMatterExample example);

    BaseDepotToMatter selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseDepotToMatter record, @Param("example") BaseDepotToMatterExample example);

    int updateByExample(@Param("record") BaseDepotToMatter record, @Param("example") BaseDepotToMatterExample example);

    int updateByPrimaryKeySelective(BaseDepotToMatter record);

    int updateByPrimaryKey(BaseDepotToMatter record);
}