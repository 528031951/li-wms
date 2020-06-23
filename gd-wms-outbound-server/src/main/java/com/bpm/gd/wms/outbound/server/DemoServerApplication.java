package com.bpm.gd.wms.outbound.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.bpm.gd.wms.outbound.server.mapper")
@EnableFeignClients(
        basePackages = {"com.bpm.log.client","com.bpm.gd.srm.order.client","com.bpm.gd.srm.order.common"}
)
@ComponentScan({"com.bpm.log.client", "com.bpm.gd.wms.outbound"})
public class DemoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServerApplication.class, args);
    }

}
