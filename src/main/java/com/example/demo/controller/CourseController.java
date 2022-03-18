package com.example.demo.controller;

import com.example.demo.bean.Course;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping(value = "/courses")
    private List<Course> getAllCourse(){

        return courseService.findAll();
    }
}
