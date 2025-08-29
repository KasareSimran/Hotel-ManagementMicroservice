package com.RatingService.service.impl;

import com.RatingService.model.Rating;
import com.RatingService.repository.RatingRepo;
import com.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepo ratingRepo;


    @Override
    public Rating create(Rating rating) {
        String randomRatingId= UUID.randomUUID().toString();
        rating.setRatingId(randomRatingId);
        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Rating> getByUserId(String userId) {
        return ratingRepo.findByUserId(userId);
    }

    @Override
    public List<Rating> getByHotelId(String hotelId) {
        return ratingRepo.findByHotelId(hotelId);
    }
}
