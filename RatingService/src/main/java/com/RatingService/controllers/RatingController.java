package com.RatingService.controllers;

import com.RatingService.model.Rating;
import com.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    //create
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    //get all rating
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRating(){
        return ResponseEntity.ok(ratingService.getAllRating());
    }


    //get all rating by userID
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getAllByUserId(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getByUserId(userId));
    }


    //get all ratings by hotelID
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getAllByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getByHotelId(hotelId));
    }
}
