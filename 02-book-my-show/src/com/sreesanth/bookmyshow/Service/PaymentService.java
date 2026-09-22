package com.sreesanth.bookmyshow.service;

import com.sreesanth.bookmyshow.model.Booking;
import com.sreesanth.bookmyshow.model.BookingStatus;
import com.sreesanth.bookmyshow.model.ShowSeat;
import com.sreesanth.bookmyshow.model.SeatStatus;

public class PaymentService {

    private final BookingService bookingService;

    public PaymentService(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public boolean processPayment(String bookingId) {

        Booking booking = bookingService.getBookingById(bookingId);

        if (booking == null) {
            return false;
        }

        if (booking.getStatus() != BookingStatus.CREATED) {
            return false;
        }

        boolean paymentSuccessful = processPayment();

        if (paymentSuccessful) {
            confirmBooking(booking);
            return true;
        }

        cancelBooking(booking);
        return false;
    }

    private boolean processPayment() {
        // Simulating payment gateway
        return true;
    }

    private void confirmBooking(Booking booking) {

        for (ShowSeat showSeat : booking.getSeats()) {
            showSeat.setStatus(SeatStatus.BOOKED);
        }

        booking.setStatus(BookingStatus.CONFIRMED);
    }

    private void cancelBooking(Booking booking) {

        for (ShowSeat showSeat : booking.getSeats()) {
            showSeat.setStatus(SeatStatus.AVAILABLE);
        }

        booking.setStatus(BookingStatus.CANCELLED);
    }
}
