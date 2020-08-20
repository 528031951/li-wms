package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.BaseStorekeeperLine;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseStorekeeperLineExtMapper {

    List<BaseStorekeeperLine> selectByUserId(@Param("userId") Integer userId);

    List<BaseStorekeeperLine> selectByUserIdAndLineCode(@Param("userId") Integer userId, @Param("lineName") String lineName);

}
