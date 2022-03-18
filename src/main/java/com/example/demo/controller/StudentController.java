package com.example.demo.controller;

import com.example.demo.bean.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value="/students")
    public List<Student> findAllStudent(){

        return studentService.findAll();
    }
}
