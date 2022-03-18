package com.example.demo.service;

import com.example.demo.bean.Rating;
import com.example.demo.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService{
    @Autowired
    RatingRepository ratingRepository;

    @Override
    public List<Rating> findAll() {
        return ratingRepository.findAll();
    }
}
