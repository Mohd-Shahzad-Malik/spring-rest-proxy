package com.spring.rest.proxy.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    public String home(){
        return "Hello";
    }
}
