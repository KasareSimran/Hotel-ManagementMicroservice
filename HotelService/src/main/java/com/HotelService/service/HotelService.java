package com.HotelService.service;

import com.HotelService.model.Hotel;

import java.util.List;

public interface HotelService {

    //create

    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get single

    Hotel getById(String hotelId);

}
