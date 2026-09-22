package com.sreesanth.bookmyshow.service;

import com.sreesanth.bookmyshow.model.Movie;
import com.sreesanth.bookmyshow.model.Show;

import java.util.ArrayList;
import java.util.List;

public class ShowService {

    private final List<Show> shows;

    public ShowService() {
        this.shows = new ArrayList<>();
    }

    public void addShow(Show show) {
        shows.add(show);
    }

    public void removeShow(Show show) {
        shows.remove(show);
    }

    public List<Show> getAllShows() {
        return new ArrayList<>(shows);
    }

    public List<Show> getShowsByMovie(Movie movie) {
        List<Show> result = new ArrayList<>();

        for (Show show : shows) {
            if (show.getMovie().equals(movie)) {
                result.add(show);
            }
        }

        return result;
    }

    public Show getShowById(String showId) {
        for (Show show : shows) {
            if (show.getShowId().equals(showId)) {
                return show;
            }
        }

        return null;
    }

    public List<Show> getShowsByMovieAndLocation(
            String movieId,
            String city) {

        List<Show> result = new ArrayList<>();

        for (Show show : shows) {
            boolean movieMatches
                    = show.getMovie()
                            .getMovieId()
                            .equals(movieId);

            boolean locationMatches
                    = show.getScreen()
                            .getTheatre()
                            .getLocation()
                            .getCity()
                            .equalsIgnoreCase(city);

            if (movieMatches && locationMatches) {
                result.add(show);
            }
        }

        return result;
    }

    public List<Show> getShowsByLocation(String city) {
        List<Show> result = new ArrayList<>();

        for (Show show : shows) {
            String showCity = show.getScreen()
                    .getTheatre()
                    .getLocation()
                    .getCity();

            if (showCity.equalsIgnoreCase(city)) {
                result.add(show);
            }
        }

        return result;
    }
}
