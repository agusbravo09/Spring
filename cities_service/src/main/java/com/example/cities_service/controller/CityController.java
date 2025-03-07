package com.example.cities_service.controller;

import com.example.cities_service.dto.CityDTO;
import com.example.cities_service.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private ICityService service;

    @GetMapping("/hotels")
    public CityDTO getHotelsByCityId(@RequestParam String name,
                                     @RequestParam String country){
        return service.getCitiesHotels(name, country);
    }
}
