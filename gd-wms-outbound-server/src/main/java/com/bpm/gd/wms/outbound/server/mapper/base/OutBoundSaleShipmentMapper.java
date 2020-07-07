package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.OutBoundSaleShipment;
import com.bpm.gd.wms.outbound.server.domain.OutBoundSaleShipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutBoundSaleShipmentMapper {
    long countByExample(OutBoundSaleShipmentExample example);

    int deleteByExample(OutBoundSaleShipmentExample example);

    int insert(OutBoundSaleShipment record);

    int insertSelective(OutBoundSaleShipment record);

    List<OutBoundSaleShipment> selectByExample(OutBoundSaleShipmentExample example);

    int updateByExampleSelective(@Param("record") OutBoundSaleShipment record, @Param("example") OutBoundSaleShipmentExample example);

    int updateByExample(@Param("record") OutBoundSaleShipment record, @Param("example") OutBoundSaleShipmentExample example);
}