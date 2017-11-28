package com.lanccj.frame.controller;

import com.lanccj.frame.dao.TestMapper;
import com.lanccj.frame.entity.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @Resource
    private TestMapper testMapper;

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello,Spring Boot";
    }

    @RequestMapping(value = "/value")
    public String value() {
        return "hello,Spring Boot value";
    }

    @RequestMapping(value = "/data")
    public String data() {
        Test test = new Test();
        test.setId(1L);
        test.setName("Test");
        testMapper.insert(test);
        return "hello,Spring Boot data";
    }

}