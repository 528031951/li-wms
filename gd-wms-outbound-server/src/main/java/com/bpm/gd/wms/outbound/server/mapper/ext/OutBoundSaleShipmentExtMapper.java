package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.OutBoundSaleShipment;
import com.bpm.gd.wms.outbound.server.domain.OutBoundSaleShipmentExample;
import com.bpm.gd.wms.outbound.server.dto.OutBoundSaleShipmentDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OutBoundSaleShipmentExtMapper {
    long countByExample(OutBoundSaleShipmentExample example);

    int deleteByExample(OutBoundSaleShipmentExample example);

    int insert(OutBoundSaleShipment record);

    int insertSelective(OutBoundSaleShipment record);

    List<OutBoundSaleShipment> selectByExample(OutBoundSaleShipmentExample example);

    int updateByExampleSelective(@Param("record") OutBoundSaleShipment record, @Param("example") OutBoundSaleShipmentExample example);

    int updateByExample(@Param("record") OutBoundSaleShipment record, @Param("example") OutBoundSaleShipmentExample example);

    List<OutBoundSaleShipment> findShipmentAllPageList(OutBoundSaleShipmentDTO outBoundSaleShipmentDTO);

}