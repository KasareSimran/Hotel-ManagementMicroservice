package com.RatingService.service;

import com.RatingService.model.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);

    //get all ratings
    List<Rating> getAllRating();

    //get all by user id
    List<Rating> getByUserId(String userId);


    //get all by hotel
    List<Rating> getByHotelId(String hotelId);
}
