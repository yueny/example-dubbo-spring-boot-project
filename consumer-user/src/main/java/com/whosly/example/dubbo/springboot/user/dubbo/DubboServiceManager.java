package com.whosly.example.dubbo.springboot.user.dubbo;

import com.whosly.example.dubbo.springboot.order.facade.dubbo.IDemoService;
import lombok.Getter;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component
public class DubboServiceManager {
    @DubboReference
    @Getter
    private IDemoService demoService;

}
