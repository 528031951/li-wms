package com.bpm.gd.wms.outbound.server.configration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author Super Young
 * @Date 2020/8/5 18:53
 */
@Configuration
@Component
@Data
public class UrlConfig {

    @Value("${request.url}")
    private String url;

    @Value("${request.srmUserUrl}")
    private String srmUserUrl;

    @Value("${request.mesOrderUrl}")
    private String mesOrderUrl;

    @Value("${request.mesOrderBoxUrl}")
    private String mesOrderBoxUrl;
}
