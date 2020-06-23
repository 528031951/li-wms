package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.OutBoundFillBillTask;
import com.bpm.gd.wms.outbound.server.domain.OutBoundFillBillTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutBoundFillBillTaskMapper {
    long countByExample(OutBoundFillBillTaskExample example);

    int deleteByExample(OutBoundFillBillTaskExample example);

    int deleteByPrimaryKey(String id);

    int insert(OutBoundFillBillTask record);

    int insertSelective(OutBoundFillBillTask record);

    List<OutBoundFillBillTask> selectByExample(OutBoundFillBillTaskExample example);

    OutBoundFillBillTask selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OutBoundFillBillTask record, @Param("example") OutBoundFillBillTaskExample example);

    int updateByExample(@Param("record") OutBoundFillBillTask record, @Param("example") OutBoundFillBillTaskExample example);

    int updateByPrimaryKeySelective(OutBoundFillBillTask record);

    int updateByPrimaryKey(OutBoundFillBillTask record);
}