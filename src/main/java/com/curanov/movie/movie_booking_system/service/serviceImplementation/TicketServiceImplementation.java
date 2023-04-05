package com.curanov.movie.movie_booking_system.service.serviceImplementation;

import com.curanov.movie.movie_booking_system.entity.*;
import com.curanov.movie.movie_booking_system.repository.TicketRepository;
import com.curanov.movie.movie_booking_system.service.serviceInterface.TicketService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TicketServiceImplementation implements TicketService {

    TicketRepository ticketRepository;

    public TicketServiceImplementation(@Autowired TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket getTicketById(int id) {
        return ticketRepository.findById(id)
                .orElseThrow( () -> new IllegalArgumentException("Ticket does not exist"));
    }

    @Override
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public void deleteTicketById(int id) {
        ticketRepository.findById(id)
                .orElseThrow( () -> new IllegalArgumentException("Ticket does not exist"));

        ticketRepository.deleteById(id);
    }

    @Override
    public List<Ticket> searchTicketsByMovieIdAndSaalId(int movieId, int saalId) {
        return ticketRepository.findByMovieIdAndSaalId(movieId, saalId);
    }

    @Override
    public List<Ticket> searchAvailableTicketsByMovieAndSaal(Movie movie, Saal saal) {
        return null;
    }



}
