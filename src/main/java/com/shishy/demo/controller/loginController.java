package com.shishy.demo.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class loginController {

    @PostMapping
    public Object login(){

        return  null;
    }

    @Data
    public static   class  loginInfo{
        String name;
        String password;
    }
}
