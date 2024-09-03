package com.example.hotelbooking.service;

import com.example.hotelbooking.model.Hotel;
import com.example.hotelbooking.model.Activity;
import com.example.hotelbooking.repository.HotelRepository;
import com.example.hotelbooking.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RecommendationService {
    @Autowired
    private ActivityRepository activityRepository;
    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> recommendHotels(Long userId) {
        List<Activity> activities = activityRepository.findByUserId(userId);
        Set<Long> hotelIds = activities.stream()
            .map(Activity::getHotelId)
            .collect(Collectors.toSet());

        return hotelRepository.findAll().stream()
            .filter(hotel -> !hotelIds.contains(hotel.getId()))
            .collect(Collectors.toList());
    }
}
