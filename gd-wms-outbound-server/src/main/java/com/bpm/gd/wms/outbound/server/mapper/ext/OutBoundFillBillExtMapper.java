package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.OutBoundFillBill;
import com.bpm.gd.wms.outbound.server.domain.OutBoundFillBillExample;
import com.bpm.gd.wms.outbound.server.dto.QueryFillBillDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OutBoundFillBillExtMapper {
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

    List<OutBoundFillBill> findFillBill(QueryFillBillDTO queryFillBillDTO);

    int dispatchFillBill(List<String> ids);

    List<OutBoundFillBill> findTaskByUser(@Param("user") String user);

    List<OutBoundFillBill> findMatterByBill( @Param("fillBillId")  String fillBillId, @Param("user")  String name);

    List<OutBoundFillBill> findPositionByBill(@Param("fillBillId") String fillBillId,  @Param("user") String name);

    List<OutBoundFillBill> findFillBIllMatter(@Param("fillBillId") String fillBillId);

}