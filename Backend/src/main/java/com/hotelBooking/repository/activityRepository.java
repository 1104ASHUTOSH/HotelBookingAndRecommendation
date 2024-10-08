package com.example.hotelbooking.repository;

import com.example.hotelbooking.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
    List<Activity> findByHotelId(Long hotelId);
    List<Activity> findByUserId(Long userId);
}
