package com.whosly.example.dubbo.springboot.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

@Scope(scopeName = WebApplicationContext.SCOPE_REQUEST)
public class BaseController {

    protected Logger logger = LoggerFactory.getLogger(getClass());


}
