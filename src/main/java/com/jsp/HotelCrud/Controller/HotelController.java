package com.jsp.HotelCrud.Controller;

import com.jsp.HotelCrud.model.Hotel;
import com.jsp.HotelCrud.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HotelController {

    @Autowired
    HotelService service;

    @PostMapping("/hotel/save")
    public Hotel save(@RequestBody Hotel hotel)
    {
        return service.saveHotel(hotel);
    }

    @GetMapping("/hotel/find")
    public Hotel findById(@RequestParam int id)
    {
        return service.findHotel(id);
    }

    @PutMapping("/hotel/update")
    public Hotel update(@RequestBody Hotel hotel)
    {
        return service.updateHotel(hotel);
    }

    @DeleteMapping("/hotel/delete")
    public String delete(@RequestParam int id)
    {
        service.deleteHotel(id);
        return "Hotel deleted successfully";
    }
}
