package com.sreesanth.bookmyshow.model;

public class ShowSeat {

    private final Seat seat;
    private SeatStatus status;

    public ShowSeat(Seat seat) {
        this.seat = seat;
        this.status = SeatStatus.AVAILABLE;
    }
}
