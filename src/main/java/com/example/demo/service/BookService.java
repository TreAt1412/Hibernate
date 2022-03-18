package com.example.demo.service;

import com.example.demo.bean.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    String addBook(String name);
    List<Book> findByName();
    List<Book> findAndSortByName(String name);
    Page<Book> pagingBook(Pageable pageable);
    Slice<Book> pagingBookBetweenId(int start, int end, Pageable pageable);
}
