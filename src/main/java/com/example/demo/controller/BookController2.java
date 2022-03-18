package com.example.demo.controller;

import com.example.demo.bean.Book;
import com.example.demo.service.BookService;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;
@RestController
public class BookController2 {
    @Autowired
    private BookService bookService;

    @GetMapping(value = "/add/{name}")
    public String findAll(@PathVariable("name") String name) {
        System.out.println("12312312");
        return "Done";

    }
    @PostMapping(value = "/add/{name}")
    public String findAll1(@PathVariable("name") String name) {
        System.out.println("1231231112");
        return "Done";

    }
}
