package com.sreesanth.bookmyshow.model;

public class Movie {

    private final String movieId;
    private final String name;
    private final String language;
    private final int durationInMinutes;

    public Movie(
            String movieId,
            String name,
            String language,
            int durationInMinutes) {

        this.movieId = movieId;
        this.name = name;
        this.language = language;
        this.durationInMinutes = durationInMinutes;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
