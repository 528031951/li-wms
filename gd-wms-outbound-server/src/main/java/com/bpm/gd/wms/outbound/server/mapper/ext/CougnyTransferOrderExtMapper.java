package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.common.dto.PageDTO;
import com.bpm.gd.wms.outbound.server.domain.CougnyTransferOrder;
import com.bpm.gd.wms.outbound.server.domain.CougnyTransferOrderExample;
import com.bpm.gd.wms.outbound.server.dto.AddCougnyTransferOrderDTO;
import com.bpm.gd.wms.outbound.server.dto.CougnyTransferOrderDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CougnyTransferOrderExtMapper {

    List<CougnyTransferOrderDTO> findTransferOrder2(PageDTO pageDTO);

    long countByExample(CougnyTransferOrderExample example);

    int deleteByExample(CougnyTransferOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CougnyTransferOrder record);

    int insertSelective(CougnyTransferOrder record);

    List<CougnyTransferOrder> selectByExample(CougnyTransferOrderExample example);

    CougnyTransferOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CougnyTransferOrder record, @Param("example") CougnyTransferOrderExample example);

    int updateByExample(@Param("record") CougnyTransferOrder record, @Param("example") CougnyTransferOrderExample example);

    int updateByPrimaryKeySelective(CougnyTransferOrder record);

    int updateByPrimaryKey(CougnyTransferOrder record);

    int addTransferOrder(AddCougnyTransferOrderDTO cto);
}