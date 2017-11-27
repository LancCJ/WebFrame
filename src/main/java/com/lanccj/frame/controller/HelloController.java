package com.lanccj.frame.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* @created with IntelliJ IDEA.
 * \* @author: chenjian
 * \* @date: 2017/11/27
 * \* @time: 下午2:53
 * \* @to change this template use File | Settings | File Templates.
 * \* @description:
 */

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello,Spring Boot";
    }

    @RequestMapping(value = "/value")
    public String value() {
        return "hello,Spring Boot value";
    }

}