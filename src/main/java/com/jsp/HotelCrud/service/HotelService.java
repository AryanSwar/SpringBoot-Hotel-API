package com.jsp.HotelCrud.service;

import com.jsp.HotelCrud.model.Hotel;

public interface HotelService {
    Hotel saveHotel(Hotel hotel);

    Hotel findHotel(int id);

    Hotel updateHotel(Hotel hotel);

    void deleteHotel(int id);
}
