package com.example.hotelbooking.controller;

import com.example.hotelbooking.model.Activity;
import com.example.hotelbooking.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @GetMapping("/hotel/{hotelId}")
    public List<Activity> getActivitiesByHotelId(@PathVariable Long hotelId) {
        return activityService.getActivitiesByHotelId(hotelId);
    }

    @PostMapping
    public Activity logActivity(@RequestBody Activity activity) {
        return activityService.logActivity(activity);
    }
}
