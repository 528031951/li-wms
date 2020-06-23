package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.OutBoundSale;
import com.bpm.gd.wms.outbound.server.domain.OutBoundSaleExample;
import com.bpm.gd.wms.outbound.server.domain.OutBoundSaleVO;
import com.bpm.gd.wms.outbound.server.dto.QueryBillDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OutBoundSaleExtMapper {
    long countByExample(OutBoundSaleExample example);

    int deleteByExample(OutBoundSaleExample example);

    int deleteByPrimaryKey(String id);

    int insert(OutBoundSale record);

    int insertSelective(OutBoundSale record);

    List<OutBoundSale> selectByExample(OutBoundSaleExample example);

    OutBoundSale selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OutBoundSale record, @Param("example") OutBoundSaleExample example);

    int updateByExample(@Param("record") OutBoundSale record, @Param("example") OutBoundSaleExample example);

    int updateByPrimaryKeySelective(OutBoundSale record);

    int updateByPrimaryKey(OutBoundSale record);

    List<OutBoundSale> findSaleInfo(QueryBillDTO queryBillDTO);

    List<OutBoundSale> findSaleMatter(@Param("saleId") String saleId);

    int dispatchSale(List<String> ids);

    List<OutBoundSale> findSaleTaskByUser(@Param("user") String user);

    List<OutBoundSaleVO> findPositionBySale(@Param("saleId")  String saleId, @Param("name")  String name);
}