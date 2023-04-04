package com.curanov.movie.movie_booking_system.service.serviceImplementation;

import com.curanov.movie.movie_booking_system.entity.Movie;
import com.curanov.movie.movie_booking_system.repository.MovieRepository;
import com.curanov.movie.movie_booking_system.service.serviceInterface.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImplementation implements MovieService {

    MovieRepository movieRepository;

    public MovieServiceImplementation(@Autowired MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAllMovies() {
        List<Movie> movieList = movieRepository.findAll();

        return movieList;
    }

    @Override
    public Movie getMovieById(int id) {
        return movieRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Movie not found!"));
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void deleteMovieById(int id) {
        movieRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Movie not found!"));

        movieRepository.deleteById(id);
    }

    @Override
    public List<Movie> searchMoviesByTitle(String title) {
        List<Movie> movieList = movieRepository.findByTitleContainingIgnoreCase(title);

        if(movieList.isEmpty()) {
            throw new IllegalArgumentException("Movie not found");
        }

        return movieList;
    }
}
