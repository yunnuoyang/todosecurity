package com.codefacker.controller;

import com.codefaker.service.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
//    FilterSecurityInterceptor
    @Autowired
    private MyUserDetailService userService;
    @RequestMapping("dologin")
    public String login(){
        System.out.println("12344566");
        return "main";
    }
    @RequestMapping("/{path}")
    public String path(@PathVariable String path){
        return path;
    }
    @RequestMapping("userLogin")
    public String userLogin(){
        return "login";
    }
    @RequestMapping("main")
    public String main(){
        return "main";
    }
}
