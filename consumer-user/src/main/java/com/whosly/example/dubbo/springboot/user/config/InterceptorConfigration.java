package com.whosly.example.dubbo.springboot.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器实例化
 *
 * @author yueny09 <deep_blue_yang@163.com>
 *
 * @DATE 2019/5/8 下午1:10
 *
 */
@Configuration
public class InterceptorConfigration extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(passportResourceRightInterceptor).addPathPatterns("/**")
//                .excludePathPatterns("/")
//                .excludePathPatterns("/passport/**")
//                .excludePathPatterns("/right/**")
//                .excludePathPatterns("/user/*")
//                .excludePathPatterns("/index/synchronousIndex")
//                .excludePathPatterns("/external/data/**")
//                .excludePathPatterns("/error/**");

        super.addInterceptors(registry);
    }

}
