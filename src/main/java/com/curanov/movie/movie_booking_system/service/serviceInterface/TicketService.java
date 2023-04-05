package com.curanov.movie.movie_booking_system.service.serviceInterface;

import com.curanov.movie.movie_booking_system.entity.*;

import java.util.List;

public interface TicketService {
    Ticket getTicketById(int id);
    Ticket saveTicket(Ticket ticket);
    void deleteTicketById(int id);
    List<Ticket> searchTicketsByMovieIdAndSaalId(int movieId, int saalId);
    List<Ticket> searchAvailableTicketsByMovieAndSaal(Movie movie, Saal saal);

}
