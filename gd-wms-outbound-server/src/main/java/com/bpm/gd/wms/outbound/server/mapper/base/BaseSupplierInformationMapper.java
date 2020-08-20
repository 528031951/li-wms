package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.BaseSupplierInformation;
import com.bpm.gd.wms.outbound.server.domain.BaseSupplierInformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseSupplierInformationMapper {
    long countByExample(BaseSupplierInformationExample example);

    int deleteByExample(BaseSupplierInformationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseSupplierInformation record);

    int insertSelective(BaseSupplierInformation record);

    List<BaseSupplierInformation> selectByExample(BaseSupplierInformationExample example);

    BaseSupplierInformation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseSupplierInformation record, @Param("example") BaseSupplierInformationExample example);

    int updateByExample(@Param("record") BaseSupplierInformation record, @Param("example") BaseSupplierInformationExample example);

    int updateByPrimaryKeySelective(BaseSupplierInformation record);

    int updateByPrimaryKey(BaseSupplierInformation record);
}