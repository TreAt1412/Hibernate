package com.example.demo.service;

import com.example.demo.bean.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public String addBook(String name) {
        bookRepository.save(new Book(name));
        return "Done";

    }

    @Override
    public List<Book> findByName() {
        return bookRepository.findByOrderByNameAsc();
    }

    @Override
    public List<Book> findAndSortByName(String name) {
        return bookRepository.findByName(name, Sort.by(Sort.Direction.DESC, "id"));
    }

    @Override
    public Page<Book> pagingBook(Pageable pageable) {
        return bookRepository.findByNameIsNotNull(pageable);
    }

    @Override
    public Slice<Book> pagingBookBetweenId(int start, int end, Pageable pageable) {
        return bookRepository.findByIdBetween(start, end, pageable);
    }
}
