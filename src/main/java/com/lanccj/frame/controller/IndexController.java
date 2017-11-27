package com.lanccj.frame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * \* @created with IntelliJ IDEA.
 * \* @author: chenjian
 * \* @date: 2017/11/27
 * \* @time: 下午2:53
 * \* @to change this template use File | Settings | File Templates.
 * \* @description:
 */

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        return "index";
    }


    @RequestMapping("/toLogin")
    public String toLogin(ModelMap map) {
        return "toLogin";
    }
}