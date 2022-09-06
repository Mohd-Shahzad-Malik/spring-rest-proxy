package com.spring.rest.proxy.utilites;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }


}
