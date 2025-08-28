package com.HotelService.service.impl;

import com.HotelService.exception.ResourceNotFound;
import com.HotelService.model.Hotel;
import com.HotelService.repository.HotelRepo;
import com.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel getById(String hotelId) {
        return hotelRepo.findById(hotelId).orElseThrow(()->new ResourceNotFound("hotel with given id not found:"+hotelId));
    }
}
