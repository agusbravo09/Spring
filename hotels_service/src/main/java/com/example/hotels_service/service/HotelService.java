package com.example.hotels_service.service;

import com.example.hotels_service.model.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService implements IHotelService{
    List<Hotel> hotelList = new ArrayList<Hotel>();

    @Override
    public List<Hotel> getHotelsByCityId(Long city_id) {

        List<Hotel> hotelCityList = new ArrayList<Hotel>();

        this.loadHotels();

        for(Hotel h : hotelList){
            if(h.getCity_id()==city_id){
                hotelCityList.add(h);
            }
        }

        return hotelCityList;
    }

    public void loadHotels(){
        hotelList.add(new Hotel(1L, "Paradise", 5, 1L));
        hotelList.add(new Hotel(2L, "Sunset View", 2, 2L));
        hotelList.add(new Hotel(3L, "Ocean Breeze", 4, 3L));
        hotelList.add(new Hotel(4L, "Mountain Retreat", 1, 1L));
        hotelList.add(new Hotel(5L, "City Lights Inn", 2, 2L));
        hotelList.add(new Hotel(6L, "Riverside Lodge", 4, 3L));
        hotelList.add(new Hotel(7L, "Cozy Cabin Resort", 5, 1L));
        hotelList.add(new Hotel(8L, "Luxury Heaven", 3, 2L));
        hotelList.add(new Hotel(9L, "Historic Grand Hotel", 5, 3L));
        hotelList.add(new Hotel(10L, "Tranquit Gardens", 3, 1L));

    }
}
