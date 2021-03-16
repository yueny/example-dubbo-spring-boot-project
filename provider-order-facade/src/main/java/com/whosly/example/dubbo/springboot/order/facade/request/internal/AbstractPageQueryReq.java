package com.whosly.example.dubbo.springboot.order.facade.request.internal;

import lombok.Getter;
import lombok.Setter;

/**
 * 分页查询条件
 */
@Getter
@Setter
public class AbstractPageQueryReq extends AbstractReq {

    /**
     * 查询页数
     */
    private Long page = 1L;

    /**
     * 每页大小
     */
    private Long rows = 15L;

}
