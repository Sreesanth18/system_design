package com.sreesanth.bookmyshow.model;

import java.util.ArrayList;
import java.util.List;

public class Booking {

    private final String bookingId;
    private final Show show;
    private final List<Seat> seats;
    private BookingStatus status;

    public Booking(String bookingId, Show show) {
        this.bookingId = bookingId;
        this.show = show;
        this.seats = new ArrayList<>();
        this.status = BookingStatus.CREATED;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Show getShow() {
        return show;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
}
