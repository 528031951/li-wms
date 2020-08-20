package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.CougnyTransferOrderProduct;
import com.bpm.gd.wms.outbound.server.domain.CougnyTransferOrderProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CougnyTransferOrderProductMapper {
    long countByExample(CougnyTransferOrderProductExample example);

    int deleteByExample(CougnyTransferOrderProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CougnyTransferOrderProduct record);

    int insertSelective(CougnyTransferOrderProduct record);

    List<CougnyTransferOrderProduct> selectByExample(CougnyTransferOrderProductExample example);

    CougnyTransferOrderProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CougnyTransferOrderProduct record, @Param("example") CougnyTransferOrderProductExample example);

    int updateByExample(@Param("record") CougnyTransferOrderProduct record, @Param("example") CougnyTransferOrderProductExample example);

    int updateByPrimaryKeySelective(CougnyTransferOrderProduct record);

    int updateByPrimaryKey(CougnyTransferOrderProduct record);
}