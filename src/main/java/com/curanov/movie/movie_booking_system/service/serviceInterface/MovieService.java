package com.curanov.movie.movie_booking_system.service.serviceInterface;

import com.curanov.movie.movie_booking_system.entity.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getAllMovies();

    Movie getMovieById(int id);

    Movie saveMovie(Movie movie);

    void deleteMovieById(int id);

    List<Movie> searchMoviesByTitle(String title);

}
