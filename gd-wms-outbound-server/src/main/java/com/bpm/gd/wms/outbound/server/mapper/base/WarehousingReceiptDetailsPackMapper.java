package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.WarehousingReceiptDetailsPack;
import com.bpm.gd.wms.outbound.server.domain.WarehousingReceiptDetailsPackExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface WarehousingReceiptDetailsPackMapper {
    long countByExample(WarehousingReceiptDetailsPackExample example);

    int deleteByExample(WarehousingReceiptDetailsPackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WarehousingReceiptDetailsPack record);

    int insertSelective(WarehousingReceiptDetailsPack record);

    List<WarehousingReceiptDetailsPack> selectByExample(WarehousingReceiptDetailsPackExample example);

    WarehousingReceiptDetailsPack selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WarehousingReceiptDetailsPack record, @Param("example") WarehousingReceiptDetailsPackExample example);

    int updateByExample(@Param("record") WarehousingReceiptDetailsPack record, @Param("example") WarehousingReceiptDetailsPackExample example);

    int updateByPrimaryKeySelective(WarehousingReceiptDetailsPack record);

    int updateByPrimaryKey(WarehousingReceiptDetailsPack record);

    /**
     * 根据箱子序列号修改小包装为出库状态
     * @param boxNo
     * @return
     */
    int updateIsBoundByBoxNo(@Param("boxNo") String boxNo);

    /**
     * 根据小包装编号查询合格数量（已出库状态）
     * @param packNo
     * @return
     */
    BigDecimal selectMaterialNumberQuaByPackNo(@Param("packNo") String packNo);
}