package com.whosly.example.dubbo.springboot.order.facade.dubbo;

import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.util.Random;

/**
 * Default {@link IDemoService}
 *
 * @see IDemoService
 * @since 2.7.0
 */
@DubboService
public class DemoServiceImpl implements IDemoService {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final Random costTimeRandom = new Random();

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        await();
        return String.format("[%s] : Hello, %s", serviceName, name);
    }

    private void await() {
        try {
            long timeInMillisToWait = costTimeRandom.nextInt(500);
            Thread.sleep(timeInMillisToWait);
            logger.info("execution time : " + timeInMillisToWait + " ms.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}