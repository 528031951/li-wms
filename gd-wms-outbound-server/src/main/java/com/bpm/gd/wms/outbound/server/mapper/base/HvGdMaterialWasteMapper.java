package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.HvGdMaterialWaste;
import com.bpm.gd.wms.outbound.server.domain.HvGdMaterialWasteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HvGdMaterialWasteMapper {
    long countByExample(HvGdMaterialWasteExample example);

    int deleteByExample(HvGdMaterialWasteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HvGdMaterialWaste record);

    int insertSelective(HvGdMaterialWaste record);

    List<HvGdMaterialWaste> selectByExample(HvGdMaterialWasteExample example);

    HvGdMaterialWaste selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HvGdMaterialWaste record, @Param("example") HvGdMaterialWasteExample example);

    int updateByExample(@Param("record") HvGdMaterialWaste record, @Param("example") HvGdMaterialWasteExample example);

    int updateByPrimaryKeySelective(HvGdMaterialWaste record);

    int updateByPrimaryKey(HvGdMaterialWaste record);

    /**
     * 根据工单编号查询未上传的料废信息
     * @param workOrderCode
     * @return
     */
    List<HvGdMaterialWaste> selectByWorkOrderCode(@Param("workOrderCode") String workOrderCode);
}