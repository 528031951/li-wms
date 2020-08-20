package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.vo.TrayInfoVO;

/**
 * @Author Super Young
 * @Date 2020/8/17 19:24
 */
public interface BaseDepotToCaseExtMapper {
    int selectByCaseNo(String trayNo);

    void deleteByBoxCode(String boxBarcode);

    TrayInfoVO selectInfoByCaseNo(String code);
}
