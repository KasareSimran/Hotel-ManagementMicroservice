package com.UserService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Rating {

    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private String rating;
    private String feedback;




}
