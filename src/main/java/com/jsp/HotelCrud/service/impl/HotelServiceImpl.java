package com.jsp.HotelCrud.service.impl;

import com.jsp.HotelCrud.model.Hotel;
import com.jsp.HotelCrud.repository.HotelRepository;
import com.jsp.HotelCrud.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel saveHotel(Hotel hotel)
    {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel findHotel(int id)
    {
        return hotelRepository.findById(id).orElseThrow(()->new RuntimeException("Hotel not found"));
    }

    @Override
    public Hotel updateHotel(Hotel hotel)
    {
        Hotel hotel1 = hotelRepository.findById(hotel.getId()).orElseThrow(()->new RuntimeException("Hotel not found"));
        return hotelRepository.save(hotel1);
    }

    @Override
    public void deleteHotel(int id)
    {
        hotelRepository.deleteById(id);
    }
}
