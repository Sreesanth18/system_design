package com.sreesanth.bookmyshow.service;

import com.sreesanth.bookmyshow.model.SeatStatus;
import com.sreesanth.bookmyshow.model.Show;
import com.sreesanth.bookmyshow.model.ShowSeat;

import java.util.ArrayList;
import java.util.List;

public class SeatSelectionService {

    private final ShowService showService;

    public SeatSelectionService(ShowService showService) {
        this.showService = showService;
    }

    public List<ShowSeat> getAvailableSeats(String showId) {

        Show show = showService.getShowById(showId);

        if (show == null) {
            return new ArrayList<>();
        }

        List<ShowSeat> availableSeats = new ArrayList<>();

        for (ShowSeat showSeat : show.getShowSeats()) {
            if (showSeat.getStatus() == SeatStatus.AVAILABLE) {
                availableSeats.add(showSeat);
            }
        }

        return availableSeats;
    }

    public boolean lockSeats(String showId, List<String> seatNumbers) {

        Show show = showService.getShowById(showId);

        if (show == null) {
            return false;
        }

        for (ShowSeat showSeat : show.getShowSeats()) {

            if (seatNumbers.contains(
                    showSeat.getSeat().getSeatNumber())) {

                if (showSeat.getStatus() != SeatStatus.AVAILABLE) {
                    return false;
                }
            }
        }

        for (ShowSeat showSeat : show.getShowSeats()) {

            if (seatNumbers.contains(
                    showSeat.getSeat().getSeatNumber())) {

                showSeat.setStatus(SeatStatus.LOCKED);
            }
        }

        return true;
    }
}
