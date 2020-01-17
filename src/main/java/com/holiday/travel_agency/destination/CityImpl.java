package com.holiday.travel_agency.destination;

public class CityImpl implements City {

    private String city;
    private Country country;

    @Override
    public String getCity() {
        return this.city;
    }

    public Country getCountry() {
        return country;
    }

    public CityImpl(String city, Country country) {
        this.city = city;
        this.country = country;
    }
}
