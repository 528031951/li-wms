package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.WarehousingRecord;
import com.bpm.gd.wms.outbound.server.domain.WarehousingRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehousingRecordMapper {
    long countByExample(WarehousingRecordExample example);

    int deleteByExample(WarehousingRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WarehousingRecord record);

    int insertSelective(WarehousingRecord record);

    List<WarehousingRecord> selectByExample(WarehousingRecordExample example);

    WarehousingRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WarehousingRecord record, @Param("example") WarehousingRecordExample example);

    int updateByExample(@Param("record") WarehousingRecord record, @Param("example") WarehousingRecordExample example);

    int updateByPrimaryKeySelective(WarehousingRecord record);

    int updateByPrimaryKey(WarehousingRecord record);
}