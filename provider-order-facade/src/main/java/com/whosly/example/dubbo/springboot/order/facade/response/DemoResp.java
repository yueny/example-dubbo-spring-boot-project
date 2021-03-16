package com.whosly.example.dubbo.springboot.order.facade.response;

import lombok.Getter;
import lombok.Setter;

/**
 * demo 相应结果
 */
@Getter
@Setter
public class DemoResp extends BaseResponse {
    /**
     * 特征名称
     */
    private String name;
}
