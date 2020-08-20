package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.BaseDepotManagement;
import com.bpm.gd.wms.outbound.server.domain.BaseDepotManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseDepotManagementMapper {
    long countByExample(BaseDepotManagementExample example);

    int deleteByExample(BaseDepotManagementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseDepotManagement record);

    int insertSelective(BaseDepotManagement record);

    List<BaseDepotManagement> selectByExample(BaseDepotManagementExample example);

    BaseDepotManagement selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseDepotManagement record, @Param("example") BaseDepotManagementExample example);

    int updateByExample(@Param("record") BaseDepotManagement record, @Param("example") BaseDepotManagementExample example);

    int updateByPrimaryKeySelective(BaseDepotManagement record);

    int updateByPrimaryKey(BaseDepotManagement record);
}