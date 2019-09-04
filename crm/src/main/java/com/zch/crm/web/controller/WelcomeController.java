package com.zch.crm.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: TODO
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:38
 * @version:1.0.0
 */
@Controller
public class WelcomeController {

    @RequestMapping("/hello")
    public String welcome(){

        return "common/welcome";
    }

    //跳转到主页
    @RequestMapping("/index")
    public String index(){

        return "/main.jsp";
    }

}
