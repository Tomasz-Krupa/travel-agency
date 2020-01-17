package com.holiday.travel_agency.trip;

import com.holiday.travel_agency.destination.City;
import com.holiday.travel_agency.destination.Hotel;

import java.time.LocalDate;

public interface Trip {

    Hotel getHotel();
    City getDeparture();
    LocalDate getDate();
    int getDuration();
    int getPlacesLimit();
    public int getFreePlacesLeft();
    public void setFreePlacesLeft( int boughtPlaces);
    double getAdultPrice();
    double getChildPrice();

}
