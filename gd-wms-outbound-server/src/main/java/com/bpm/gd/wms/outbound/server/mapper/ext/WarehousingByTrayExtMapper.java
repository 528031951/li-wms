package com.bpm.gd.wms.outbound.server.mapper.ext;

import com.bpm.gd.wms.outbound.server.domain.WarehousingByTray;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author Super Young
 * @Date 2020/8/17 17:29
 */
public interface WarehousingByTrayExtMapper {
    WarehousingByTray selectInfoByTrayCode(String trayNo);

    int selectByTrayNo(String trayNo);

    void updateCountByBoxCode(@Param("quantity") BigDecimal quantity, @Param("barcode") String barcode);
}
