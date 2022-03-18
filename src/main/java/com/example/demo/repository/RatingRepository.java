package com.example.demo.repository;

import com.example.demo.bean.Book;
import com.example.demo.bean.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
}
