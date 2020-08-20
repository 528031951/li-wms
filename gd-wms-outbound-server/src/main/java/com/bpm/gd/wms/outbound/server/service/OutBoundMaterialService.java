package com.bpm.gd.wms.outbound.server.service;

import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.dto.MaterialOutBoundDTO;


/**
 * @Author Super Young
 * @Date 2020/8/5 15:33
 */
public interface OutBoundMaterialService {
    ResultVO outBound(MaterialOutBoundDTO materialOutBoundDTO,String status,String type);

}
