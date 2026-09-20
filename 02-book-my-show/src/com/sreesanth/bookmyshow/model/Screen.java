package com.sreesanth.bookmyshow.model;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private final int screenId;
    private final List<Seat> seats;
    private final List<Show> shows;

    public Screen(int screenId) {
        this.screenId = screenId;
        this.seats = new ArrayList<>();
        this.shows = new ArrayList<>();
    }

    public int getScreenId() {
        return screenId;
    }

    public List<Show> getShows() {
        return shows;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void addShow(Show show) {
        shows.add(show);
        System.out.println("Show added succesfully");
    }

    public void removeShow(Show show) {
        shows.remove(show);
        System.out.println("Show removed succesfully");
    }

}
