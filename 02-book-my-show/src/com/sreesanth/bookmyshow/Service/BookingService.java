package com.sreesanth.bookmyshow.service;

import com.sreesanth.bookmyshow.model.Booking;
import com.sreesanth.bookmyshow.model.BookingStatus;
import com.sreesanth.bookmyshow.model.Show;
import com.sreesanth.bookmyshow.model.ShowSeat;

import java.util.ArrayList;
import java.util.List;

public class BookingService {

    private final List<Booking> bookings;
    private final ShowService showService;

    public BookingService(ShowService showService) {
        this.bookings = new ArrayList<>();
        this.showService = showService;
    }

    public Booking createBooking(
            String bookingId,
            String showId,
            List<ShowSeat> seats) {

        Show show = showService.getShowById(showId);

        if (show == null) {
            return null;
        }

        Booking booking = new Booking(
                bookingId,
                show,
                seats
        );

        bookings.add(booking);

        return booking;
    }

    public Booking getBookingById(String bookingId) {

        for (Booking booking : bookings) {
            if (booking.getBookingId().equals(bookingId)) {
                return booking;
            }
        }

        return null;
    }

    public boolean cancelBooking(String bookingId) {

        Booking booking = getBookingById(bookingId);

        if (booking == null) {
            return false;
        }

        if (booking.getStatus() == BookingStatus.CANCELLED) {
            return false;
        }

        booking.setStatus(BookingStatus.CANCELLED);

        return true;
    }

    public List<Booking> getAllBookings() {
        return new ArrayList<>(bookings);
    }
}
