package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.CougnyTransferOrder;
import com.bpm.gd.wms.outbound.server.domain.CougnyTransferOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CougnyTransferOrderMapper {
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
}