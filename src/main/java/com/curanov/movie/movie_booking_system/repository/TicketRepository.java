package com.curanov.movie.movie_booking_system.repository;

import com.curanov.movie.movie_booking_system.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    List<Ticket> findByMovieIdAndSaalId(int movieId, int saalId);


}
