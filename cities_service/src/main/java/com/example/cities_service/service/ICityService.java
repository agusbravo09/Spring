package com.example.cities_service.service;

import com.example.cities_service.dto.CityDTO;

public interface ICityService {
    public CityDTO getCitiesHotels(String name, String country);
}
