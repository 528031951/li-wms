package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.BaseHighLevelRack;

import java.util.List;

/**
 * @Author Super Young
 * @Date 2020/8/6 12:03
 */
public interface BaseHighLevelRackExtMapper {
    List<BaseHighLevelRack> selectByMaterialNo(String materialItemNo);
}
