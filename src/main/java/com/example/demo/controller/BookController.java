package com.example.demo.controller;

import com.example.demo.service.BookService;
import com.example.demo.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/books")
    public List<Book> findAll() {
        return bookService.findAll();
    }
    @GetMapping(value = "/books/all")
    public List<Book> findByName(){
        return bookService.findByName();
    }
    @GetMapping(value = "/books/{name}")
    public List<Book> findAndSortByName(@PathVariable String name){

        return bookService.findAndSortByName(name);
    }

    @GetMapping(value="/books/page/{limit}/{offset}")
    public Page<Book> pagingBook(@PathVariable Integer limit, @PathVariable Integer offset){
        return bookService.pagingBook(PageRequest.of(offset,limit ));
    }

    @GetMapping(value = "books/page/id/{start}/{end}/{pageSize}/{pageNumber}")
    public Slice<Book> pagingBookById(@PathVariable Integer start, @PathVariable Integer end,
                                      @PathVariable Integer pageSize, @PathVariable Integer pageNumber){
        return bookService.pagingBookBetweenId(start,end,PageRequest.of(pageNumber, pageSize));
    }
}