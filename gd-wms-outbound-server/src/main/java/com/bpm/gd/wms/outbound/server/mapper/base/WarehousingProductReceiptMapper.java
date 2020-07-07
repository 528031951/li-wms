package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.WarehousingProductReceipt;
import com.bpm.gd.wms.outbound.server.domain.WarehousingProductReceiptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehousingProductReceiptMapper {
    long countByExample(WarehousingProductReceiptExample example);

    int deleteByExample(WarehousingProductReceiptExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WarehousingProductReceipt record);

    int insertSelective(WarehousingProductReceipt record);

    List<WarehousingProductReceipt> selectByExample(WarehousingProductReceiptExample example);

    WarehousingProductReceipt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WarehousingProductReceipt record, @Param("example") WarehousingProductReceiptExample example);

    int updateByExample(@Param("record") WarehousingProductReceipt record, @Param("example") WarehousingProductReceiptExample example);

    int updateByPrimaryKeySelective(WarehousingProductReceipt record);

    int updateByPrimaryKey(WarehousingProductReceipt record);
}