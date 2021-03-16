package com.whosly.example.dubbo.springboot.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, RedisAutoConfiguration.class, RedisRepositoriesAutoConfiguration.class})
//@EnableFeignClients
//@EnableCircuitBreaker
@Slf4j
public class DubboConsumerBootstrap {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DubboConsumerBootstrap.class, args);

        String serverPort = context.getEnvironment().getProperty("server.port");

        log.info("Application started at http://localhost:" + serverPort);


//        new SpringApplicationBuilder(DubboAutoConfigurationProviderBootstrap.class)
//                .run(args);
    }

}
