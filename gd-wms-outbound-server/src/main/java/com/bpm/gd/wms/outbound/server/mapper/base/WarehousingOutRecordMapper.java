package com.bpm.gd.wms.outbound.server.mapper.base;

import com.bpm.gd.wms.outbound.server.domain.WarehousingOutRecord;
import com.bpm.gd.wms.outbound.server.domain.WarehousingOutRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehousingOutRecordMapper {
    long countByExample(WarehousingOutRecordExample example);

    int deleteByExample(WarehousingOutRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WarehousingOutRecord record);

    int insertSelective(WarehousingOutRecord record);

    List<WarehousingOutRecord> selectByExample(WarehousingOutRecordExample example);

    WarehousingOutRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WarehousingOutRecord record, @Param("example") WarehousingOutRecordExample example);

    int updateByExample(@Param("record") WarehousingOutRecord record, @Param("example") WarehousingOutRecordExample example);

    int updateByPrimaryKeySelective(WarehousingOutRecord record);

    int updateByPrimaryKey(WarehousingOutRecord record);

    List<WarehousingOutRecord> selectByWorkOrderCodeAndBoxNo(@Param("workOrderCode")String workOrderCode,@Param("boxNo")String boxNo);
}