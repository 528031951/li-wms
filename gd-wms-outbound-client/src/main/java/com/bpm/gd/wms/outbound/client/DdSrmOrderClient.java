package com.bpm.gd.wms.outbound.client;


import com.bpm.gd.wms.outbound.common.dto.OrderVO;
import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "gd-wms-outbound",
        fallbackFactory = DdSrmOrderFallBackClient.class
)
public interface DdSrmOrderClient {

    /**
     * 查询送货单信息
     * @param code   送货单编号
     * @return
     */
    @GetMapping({"/order/findDeliveryNoteCode"})
    ResultVO<OrderVO> findDeliveryNoteCode(@RequestParam("code") String code);


}
