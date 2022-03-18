package com.example.demo.repository;
import com.example.demo.bean.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository  extends JpaRepository<Book, Long> {
    List<Book> findByOrderByNameAsc();
    List<Book> findByName(String name, Sort sort);
    Page<Book> findByNameIsNotNull(Pageable pageable);
    Slice<Book> findByIdBetween(int start, int end, Pageable pageable);
}
