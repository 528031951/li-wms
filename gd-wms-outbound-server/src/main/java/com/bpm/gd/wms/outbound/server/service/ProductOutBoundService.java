package com.bpm.gd.wms.outbound.server.service;

import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import com.bpm.gd.wms.outbound.server.dto.ProductOutBoundDTO;

/**
 * @Author Super Young
 * @Date 2020/8/17 10:34
 */
public interface ProductOutBoundService {
    ResultVO outBound(ProductOutBoundDTO productOutBoundDTO);

    ResultVO BoxOrTray(String code);

    ResultVO outOrderDetail(String shipmentNo);
}
