package com.curanov.movie.movie_booking_system;

import com.curanov.movie.movie_booking_system.entity.Genre;
import com.curanov.movie.movie_booking_system.entity.Movie;
import com.curanov.movie.movie_booking_system.service.serviceImplementation.MovieServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.Duration;

@SpringBootApplication
public class MovieBookingSystemApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(MovieBookingSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}

}
