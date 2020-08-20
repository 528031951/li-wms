package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.BaseDepotToCase;
import com.bpm.gd.wms.outbound.server.domain.BaseDepotToCaseExample;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseDepotToCaseMapper {
    long countByExample(BaseDepotToCaseExample example);

    int deleteByExample(BaseDepotToCaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseDepotToCase record);

    int insertSelective(BaseDepotToCase record);

    List<BaseDepotToCase> selectByExample(BaseDepotToCaseExample example);

    BaseDepotToCase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseDepotToCase record, @Param("example") BaseDepotToCaseExample example);

    int updateByExample(@Param("record") BaseDepotToCase record, @Param("example") BaseDepotToCaseExample example);

    int updateByPrimaryKeySelective(BaseDepotToCase record);

    int updateByPrimaryKey(BaseDepotToCase record);

    BaseDepotToCase selectByCaseNo(@Param("caseNo")String caseNo);

    int updateRealNumberByCaseNo(@Param("caseNo")String caseNo, @Param("realNumber")BigDecimal realNumber);
}