package com.spring.rest.proxy.controller;

import com.spring.rest.proxy.utilites.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("user",new User());
        return "Hello";
    }

    @RequestMapping(value="/processForm", method = RequestMethod.POST)
    public String processForm(User user) {
        return "Result";
    }
}
