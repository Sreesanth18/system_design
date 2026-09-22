package com.sreesanth.bookmyshow.model;

import java.util.ArrayList;
import java.util.List;

public class Booking {

    private final String bookingId;
    private final Show show;
    private final List<ShowSeat> seats;

    private BookingStatus status;

    public Booking(
            String bookingId,
            Show show,
            List<ShowSeat> seats) {

        this.bookingId = bookingId;
        this.show = show;
        this.seats = new ArrayList<>(seats);
        this.status = BookingStatus.CREATED;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Show getShow() {
        return show;
    }

    public List<ShowSeat> getSeats() {
        return new ArrayList<>(seats);
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
}
