package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.StorageRemainMaterial;
import com.bpm.gd.wms.outbound.server.domain.StorageRemainMaterialExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StorageRemainMaterialMapper {
    long countByExample(StorageRemainMaterialExample example);

    int deleteByExample(StorageRemainMaterialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StorageRemainMaterial record);

    int insertSelective(StorageRemainMaterial record);

    List<StorageRemainMaterial> selectByExample(StorageRemainMaterialExample example);

    StorageRemainMaterial selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StorageRemainMaterial record, @Param("example") StorageRemainMaterialExample example);

    int updateByExample(@Param("record") StorageRemainMaterial record, @Param("example") StorageRemainMaterialExample example);

    int updateByPrimaryKeySelective(StorageRemainMaterial record);

    int updateByPrimaryKey(StorageRemainMaterial record);

    int deleteByBoxCode(@Param("boxCode") String boxCode);

    List<StorageRemainMaterial> selectByBoxCode(String boxCode);
}