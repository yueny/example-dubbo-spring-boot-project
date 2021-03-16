package com.whosly.example.dubbo.springboot.order.facade.request;

import com.whosly.example.dubbo.springboot.order.facade.request.internal.AbstractPageQueryReq;
import lombok.Getter;
import lombok.Setter;

/**
 * demo 提交参数
 */
@Getter
@Setter
public class DemoReq extends AbstractPageQueryReq {

    /**
     * 标签key
     */
    private String tagKey;

    /**
     * 身份证
     */
    private String certNo;

}
