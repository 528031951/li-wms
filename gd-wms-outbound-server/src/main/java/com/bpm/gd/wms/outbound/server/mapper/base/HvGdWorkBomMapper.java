package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.HvGdWorkBom;
import com.bpm.gd.wms.outbound.server.domain.HvGdWorkBomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HvGdWorkBomMapper {
    long countByExample(HvGdWorkBomExample example);

    int deleteByExample(HvGdWorkBomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HvGdWorkBom record);

    int insertSelective(HvGdWorkBom record);

    List<HvGdWorkBom> selectByExample(HvGdWorkBomExample example);

    HvGdWorkBom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HvGdWorkBom record, @Param("example") HvGdWorkBomExample example);

    int updateByExample(@Param("record") HvGdWorkBom record, @Param("example") HvGdWorkBomExample example);

    int updateByPrimaryKeySelective(HvGdWorkBom record);

    int updateByPrimaryKey(HvGdWorkBom record);
}