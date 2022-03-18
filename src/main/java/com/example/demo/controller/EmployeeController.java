package com.example.demo.controller;

import com.example.demo.bean.Company;
import com.example.demo.bean.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employees")
    private List<Employee> findAllEmployee(){
        return employeeService.findAll();
    }
    @PostMapping(value = "/employees")
    private String addEmployee(@RequestBody Employee employee){
        System.out.println(employee.toString());
        employeeService.addEmployee(employee);
        return "Done";
    }
}
