package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.OutBoundSaleShipmentDetails;
import com.bpm.gd.wms.outbound.server.domain.OutBoundSaleShipmentDetailsExample;
import com.bpm.gd.wms.outbound.server.dto.AddCougnyTransferOrderDTO;
import com.bpm.gd.wms.outbound.server.dto.OutBoundSaleShipmentDetailsDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OutBoundSaleShipmentDetailsExtMapper {
    long countByExample(OutBoundSaleShipmentDetailsExample example);

    int deleteByExample(OutBoundSaleShipmentDetailsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OutBoundSaleShipmentDetails record);

    int insertSelective(OutBoundSaleShipmentDetails record);

    List<OutBoundSaleShipmentDetails> selectByExample(OutBoundSaleShipmentDetailsExample example);

    OutBoundSaleShipmentDetails selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OutBoundSaleShipmentDetails record, @Param("example") OutBoundSaleShipmentDetailsExample example);

    int updateByExample(@Param("record") OutBoundSaleShipmentDetails record, @Param("example") OutBoundSaleShipmentDetailsExample example);

    int updateByPrimaryKeySelective(OutBoundSaleShipmentDetails record);

    int updateByPrimaryKey(OutBoundSaleShipmentDetails record);

    List<OutBoundSaleShipmentDetailsDTO> findShipmentDetailsByShipmentNo(@Param("shipmentNo") String shipmentNo,@Param("shipmentDetailsStatus") String shipmentDetailsStatus);

    int updateByid(@Param("updateByid") AddCougnyTransferOrderDTO updateByid);

    int judgeCompleteOrder(Long id);
}