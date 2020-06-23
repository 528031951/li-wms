package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.BaseDepotToProduct;
import com.bpm.gd.wms.outbound.server.domain.BaseDepotToProductExample;
import com.bpm.gd.wms.outbound.server.dto.QueryProductDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseDepotToProductExtMapper {
    long countByExample(BaseDepotToProductExample example);

    int deleteByExample(BaseDepotToProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseDepotToProduct record);

    int insertSelective(BaseDepotToProduct record);

    List<BaseDepotToProduct> selectByExample(BaseDepotToProductExample example);

    BaseDepotToProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseDepotToProduct record, @Param("example") BaseDepotToProductExample example);

    int updateByExample(@Param("record") BaseDepotToProduct record, @Param("example") BaseDepotToProductExample example);

    int updateByPrimaryKeySelective(BaseDepotToProduct record);

    int updateByPrimaryKey(BaseDepotToProduct record);

    List<BaseDepotToProduct> findProductMatter(QueryProductDTO queryProductDTO);

    int outProduct(List<BaseDepotToProduct> list);

    List<BaseDepotToProduct> findProductMatterById(List<String> list);
    List<BaseDepotToProduct> findProductMatterByIdAll(List<String> list);
}