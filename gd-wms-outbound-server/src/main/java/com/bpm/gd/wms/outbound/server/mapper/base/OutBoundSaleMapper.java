package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.OutBoundSale;
import com.bpm.gd.wms.outbound.server.domain.OutBoundSaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutBoundSaleMapper {
    long countByExample(OutBoundSaleExample example);

    int deleteByExample(OutBoundSaleExample example);

    int deleteByPrimaryKey(String id);

    int insert(OutBoundSale record);

    int insertSelective(OutBoundSale record);

    List<OutBoundSale> selectByExample(OutBoundSaleExample example);

    OutBoundSale selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OutBoundSale record, @Param("example") OutBoundSaleExample example);

    int updateByExample(@Param("record") OutBoundSale record, @Param("example") OutBoundSaleExample example);

    int updateByPrimaryKeySelective(OutBoundSale record);

    int updateByPrimaryKey(OutBoundSale record);
}