package com.holiday.travel_agency.trip;

import com.holiday.travel_agency.destination.City;
import com.holiday.travel_agency.destination.Hotel;

import java.time.LocalDate;

public class TripImpl implements Trip{

    private Hotel hotel;
    private City departure;
    private LocalDate date;
    private int duration;
    private int placesLimit;        // finaL?
    private int freePlacesLeft;


    public void setFreePlacesLeft(int freePlacesLeft) {
        this.freePlacesLeft = freePlacesLeft;
    }

    private double adultPrice;

    private double childPrice;
    public TripImpl(Hotel hotel, City departure, LocalDate date, int duration, int placesLimit, double adultPrice, double childPrice) {
        this.hotel = hotel;
        this.departure = departure;
        this.date = date;
        this.duration = duration;
        this.placesLimit = placesLimit;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
    }





    @Override
    public Hotel getHotel() {
        return this.hotel;
    }

    @Override
    public City getDeparture() {
        return this.departure;
    }

    @Override
    public LocalDate getDate() {
        return this.date;
    }

    @Override
    public int getDuration() {
        return this.duration;
    }

    @Override
    public int getPlacesLimit() {
        return this.placesLimit;
    }

    @Override
    public int getFreePlacesLeft() {
        return this.freePlacesLeft;
    }

    @Override
    public double getAdultPrice() {
        return this.adultPrice;
    }

    @Override
    public double getChildPrice() {
        return this.childPrice;
    }

}
