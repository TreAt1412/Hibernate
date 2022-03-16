package com.example.demo.service;

import com.example.demo.bean.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    String addBook(String name);
}
