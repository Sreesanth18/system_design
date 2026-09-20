package com.sreesanth.bookmyshow.model;

import java.util.ArrayList;
import java.util.List;

public class Location {

    private final String address;
    private final String city;
    private final String state;
    private final String pincode;

    private final List<Theatre> theatres;

    public Location(String address, String city, String state, String pincode) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.theatres = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPincode() {
        return pincode;
    }

    public List<Theatre> getTheatres() {
        return theatres;
    }

    public void addTheatre(Theatre theatre) {
        theatres.add(theatre);
    }
}
