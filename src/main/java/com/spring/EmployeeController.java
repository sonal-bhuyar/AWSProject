package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/employees")
    public @ResponseBody List<Employee> getEmployees(){
        System.out.println("....11111111111111111111............");
        System.out.println(employeeDaoImpl+".................................");
        return employeeDaoImpl.getEmployees();
    }

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;


}
