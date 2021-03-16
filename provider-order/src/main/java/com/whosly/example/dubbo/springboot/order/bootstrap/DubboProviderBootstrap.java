package com.whosly.example.dubbo.springboot.order.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class DubboProviderBootstrap {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(DubboAutoConfigurationProviderBootstrap.class)
//                .run(args);
        SpringApplication.run(DubboProviderBootstrap.class,args);
    }

}
