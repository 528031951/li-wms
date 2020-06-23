package com.bpm.gd.wms.outbound.client;

import com.bpm.gd.wms.outbound.common.dto.OrderVO;
import com.bpm.gd.wms.outbound.common.vo.ResultVO;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * <p>Title: DemoFallBackClient</p>
 * <p>Description: Feign异常处理</p>
 * <p>Company: http://www.wootion.com/</p>
 * <p>create date: 2020/03/26</p>
 *
 * @author :tanhuan
 * @version :1.0
 */
@Component
public class DdSrmOrderFallBackClient implements FallbackFactory<DdSrmOrderClient> {

    @Override
    public DdSrmOrderClient create(Throwable arg0) {
        return new DdSrmOrderClient(){
            @Override
            public ResultVO<OrderVO> findDeliveryNoteCode(String code) {
                ResultVO resultVO = new  ResultVO();
                resultVO.setCode(300);
                resultVO.setMsg(arg0.getMessage());
                return resultVO;
            }
        };
    }


}