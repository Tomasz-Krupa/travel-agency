package com.holiday.travel_agency.service;

import java.util.List;

public class ParticipantsImpl implements Participants {

    int adultsNumber;
    int childrenNumber;
    List<String> names;

    @Override
    public int getAdultsNumber() {
        return this.adultsNumber;
    }

    @Override
    public int getChildrenNumber() {
        return this.childrenNumber;
    }

    @Override
    public List<String> getNames() {
        return this.names;
    }
}
