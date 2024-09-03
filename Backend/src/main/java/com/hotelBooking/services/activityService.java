package com.example.hotelbooking.service;

import com.example.hotelbooking.model.Activity;
import com.example.hotelbooking.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {
    @Autowired
    private ActivityRepository activityRepository;

    public List<Activity> getActivitiesByHotelId(Long hotelId) {
        return activityRepository.findByHotelId(hotelId);
    }

    public Activity logActivity(Activity activity) {
        return activityRepository.save(activity);
    }
}
