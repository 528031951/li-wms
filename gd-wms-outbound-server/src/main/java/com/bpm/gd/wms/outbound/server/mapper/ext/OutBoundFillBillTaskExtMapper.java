package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.*;
import com.bpm.gd.wms.outbound.server.dto.QueryBillDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OutBoundFillBillTaskExtMapper {
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

    int savePosition(List<OutBoundFillBill> result);

    int savePositionWO(List<OutBoundWorkOrder> result);

    List<OutBoundFillBillTask> findPositionByBill(@Param("fillBillId") String fillBillId,@Param("name") String name);

    int outBoundMatterWO(List<OutBoundFillBillTask> list);

    int outBoundMatterWOnew(OutBoundFillBillTask record);
    int outBoundMatterFB(OutBoundFillBillTask record);
    int outBoundMatterSL(OutBoundFillBillTask record);

    List<OutBoundFillBillTask> findPositionByWorkOrder(@Param("workOrderId")  String workOrderId,@Param("name") String name);

    List<SendOrder> InBoundMatterPosition(List<SendOrder> list);

    List<OutBoundFillBillTask> findTaskByWorkOrder(@Param("workOrderId") String workOrderId, @Param("name") String name);

    List<OutBoundFillBillTask> findTaskByBill(@Param("fillBillId") String fillBillId, @Param("name") String name);

    List<OutBoundFillBillTask> findTaskBySale(@Param("saleId")  String saleId,@Param("name")  String name);

    List<OutBoundFillBillTask> findTransferOrder(QueryBillDTO queryBillDTO);



    List<OutBoundFillBillTask> findTransferId(OutBoundFillBillTask outBoundFillBillTask);

    int insertTransferInfo(OutBoundFillBillTask outBoundFillBillTask);

    List<OutBoundFillBillTask> findMatterNumberId(OutBoundFillBillTask outBoundFillBillTask);

    int updateTransferStatus(OutBoundFillBillTask outBoundFillBillTask);

    List<OutBoundFillBillTask> findTransferInfo(@Param("id") String id);

    List<OutBoundFillBillTask> findTransferInfoCount(@Param("id") String id);

}