package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.WarehousingProductReceipt;
import com.bpm.gd.wms.outbound.server.domain.WarehousingProductReceiptExample;
import com.bpm.gd.wms.outbound.server.dto.WarehousingProductReceiptDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehousingProductReceiptExtMapper {
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

    List<WarehousingProductReceiptDTO> findWarehousingProductReceiptByProductCode(@Param("productCode") String productCode);
}