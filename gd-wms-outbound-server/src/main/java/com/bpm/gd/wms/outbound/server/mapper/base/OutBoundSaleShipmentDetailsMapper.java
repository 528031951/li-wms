package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.OutBoundSaleShipmentDetails;
import com.bpm.gd.wms.outbound.server.domain.OutBoundSaleShipmentDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutBoundSaleShipmentDetailsMapper {
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
}