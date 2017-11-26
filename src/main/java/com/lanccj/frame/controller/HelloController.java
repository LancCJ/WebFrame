package com.lanccj.frame.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: chenjian
 * \* Date: 2017/11/26
 * \* Time: 下午4:38
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello,Spring Boot";
    }

}