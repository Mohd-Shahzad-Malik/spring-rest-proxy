package com.spring.rest.proxy.controller;

import com.spring.rest.proxy.utilites.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class HomeController
{
    @RequestMapping("/firstProcess")
    public List<Employee> firstProcess() {
        return Arrays.asList(new Employee(101, "Shahzad", "Developer"),
                            new Employee(102,"Shahbaz", "Busniess Analyst"),
                            new Employee(103,"Zeba","Senior Engineer"));
    }

    @RequestMapping("{id}")
    public String secondProcess(@PathVariable int id) {
        return "user id : " + id;
    }
}
