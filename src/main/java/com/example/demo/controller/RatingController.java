package com.example.demo.controller;

import com.example.demo.bean.Rating;
import com.example.demo.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RatingController {
    @Autowired
    RatingService ratingService;

    @GetMapping(value = "/ratings")
    private List<Rating> getAllRating(){
        return ratingService.findAll();
    }
}
