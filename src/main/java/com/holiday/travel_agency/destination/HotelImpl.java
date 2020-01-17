package com.holiday.travel_agency.destination;

public class HotelImpl implements Hotel{

    City city;
    String hotelName;
    double stars;
    String description;

    public HotelImpl(City city, String hotelName, double stars, String description) {
        this.city = city;
        this.hotelName = hotelName;
        this.stars = stars;
        this.description = description;
    }

    @Override
    public City getCity() {
        return this.city;
    }

    @Override
    public String getHotelName() {
        return this.hotelName;
    }

    @Override
    public double getStars() {
        return this.stars;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
