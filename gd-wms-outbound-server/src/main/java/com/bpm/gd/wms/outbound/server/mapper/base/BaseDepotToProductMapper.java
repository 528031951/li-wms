package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.BaseDepotToProduct;
import com.bpm.gd.wms.outbound.server.domain.BaseDepotToProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseDepotToProductMapper {
    long countByExample(BaseDepotToProductExample example);

    int deleteByExample(BaseDepotToProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseDepotToProduct record);

    int insertSelective(BaseDepotToProduct record);

    List<BaseDepotToProduct> selectByExample(BaseDepotToProductExample example);

    BaseDepotToProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseDepotToProduct record, @Param("example") BaseDepotToProductExample example);

    int updateByExample(@Param("record") BaseDepotToProduct record, @Param("example") BaseDepotToProductExample example);

    int updateByPrimaryKeySelective(BaseDepotToProduct record);

    int updateByPrimaryKey(BaseDepotToProduct record);
}