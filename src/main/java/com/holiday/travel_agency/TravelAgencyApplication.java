package com.holiday.travel_agency;

import com.holiday.travel_agency.destination.*;
import com.holiday.travel_agency.trip.Trip;
import com.holiday.travel_agency.trip.TripImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class TravelAgencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelAgencyApplication.class, args);

    Country spain=new CountryImpl("Spain");
    City madrid = new CityImpl("Madrid", spain);
    Hotel radison= new HotelImpl(madrid, "Radison", 5, "New nice");
    LocalDate date1= LocalDate.of(2020, 8, 1);
    Trip trip1= new TripImpl(radison, madrid, date1, 7, 10, 1500, 1000);
        System.out.println(trip1);

    }

}
