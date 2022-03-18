package com.example.demo.service;

import com.example.demo.bean.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    void addEmployee(Employee employee);
}
