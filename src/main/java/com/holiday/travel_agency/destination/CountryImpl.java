package com.holiday.travel_agency.destination;

public class CountryImpl implements Country {

    private String country;

    @Override
    public String getCountry() {
        return this.country;
    }

    public CountryImpl(String country) {
        this.country = country;
    }
}
