package com.example.hotelbooking.controller;

import com.example.hotelbooking.model.Hotel;
import com.example.hotelbooking.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {
    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/{userId}")
    public List<Hotel> recommendHotels(@PathVariable Long userId) {
        return recommendationService.recommendHotels(userId);
    }
}
