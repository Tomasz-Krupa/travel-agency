package com.holiday.travel_agency.service;

import com.holiday.travel_agency.trip.Trip;

public class PurchaseServiceImpl implements PurchaseService {

    Trip trip;
    Participants participants;

    @Override
    public Trip getTrip() {
        return this.trip;
    }

    @Override
    public Participants getParticipants() {
        return this.participants;
    }

    @Override
    public double calculateTotalPrice() {
        return (participants.getAdultsNumber()*trip.getAdultPrice()+ participants.getChildrenNumber()*trip.getChildPrice());
    }

    @Override
    public String generateConfirmation() {
        return "Confirmed";             //TODO if(za mało miejsc)
    }

    @Override
    public void actualiseFreePlacesLeft() {
        trip.setFreePlacesLeft( trip.getPlacesLimit()- (participants.getChildrenNumber()+participants.getAdultsNumber()));
    }
}
