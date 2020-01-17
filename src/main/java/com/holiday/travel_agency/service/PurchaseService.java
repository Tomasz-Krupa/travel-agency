package com.holiday.travel_agency.service;

import com.holiday.travel_agency.trip.Trip;

public interface PurchaseService {

    Trip getTrip();
    Participants getParticipants();
    double calculateTotalPrice();
    String generateConfirmation();
    void actualiseFreePlacesLeft ();            //int?


}
