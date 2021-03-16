package com.whosly.example.dubbo.springboot.user.controller;

import com.whosly.example.dubbo.springboot.user.dubbo.DubboServiceManager;
import com.whosly.example.dubbo.springboot.order.facade.dubbo.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController extends BaseController {
    @Autowired
    private DubboServiceManager dubboService;

    @GetMapping(value = "/query")
    public String queryList(){
        IDemoService demoService = dubboService.getDemoService();

        String val = demoService.sayHello("a");

        return val;
    }

}
