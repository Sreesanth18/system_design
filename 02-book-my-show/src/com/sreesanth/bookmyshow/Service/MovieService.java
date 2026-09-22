package com.sreesanth.bookmyshow.service;

import com.sreesanth.bookmyshow.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private final List<Movie> movies;

    public MovieService() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    public List<Movie> getAllMovies() {
        return new ArrayList<>(movies);
    }

    public List<Movie> getMoviesByLanguage(String language) {
        List<Movie> result = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.getLanguage().equalsIgnoreCase(language)) {
                result.add(movie);
            }
        }

        return result;
    }
}
