package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.OutBoundFillBill;
import com.bpm.gd.wms.outbound.server.domain.OutBoundFillBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutBoundFillBillMapper {
    long countByExample(OutBoundFillBillExample example);

    int deleteByExample(OutBoundFillBillExample example);

    int deleteByPrimaryKey(String id);

    int insert(OutBoundFillBill record);

    int insertSelective(OutBoundFillBill record);

    List<OutBoundFillBill> selectByExample(OutBoundFillBillExample example);

    OutBoundFillBill selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OutBoundFillBill record, @Param("example") OutBoundFillBillExample example);

    int updateByExample(@Param("record") OutBoundFillBill record, @Param("example") OutBoundFillBillExample example);

    int updateByPrimaryKeySelective(OutBoundFillBill record);

    int updateByPrimaryKey(OutBoundFillBill record);
}