package com.sreesanth.bookmyshow.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Show {

    private final String showId;
    private final Movie movie;
    private final Screen screen;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
    private final List<ShowSeat> showSeats;

    public Show(
            String showId,
            Movie movie,
            Screen screen,
            LocalDateTime startTime,
            LocalDateTime endTime) {

        this.showId = showId;
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        this.endTime = endTime;
        this.showSeats = new ArrayList<>();
    }

    public String getShowId() {
        return showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public List<ShowSeat> getShowSeats() {
        return showSeats;
    }

    public void addShowSeat(ShowSeat showSeat) {
        showSeats.add(showSeat);
    }
}
