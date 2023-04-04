package com.curanov.movie.movie_booking_system.service.serviceInterface;

import com.curanov.movie.movie_booking_system.entity.Saal;

import java.util.List;

public interface SaalService {
    List<Saal> getAllSaals();

    Saal getSaalById(int id);

    Saal saveSaal(Saal saal);

    void deleteSaalById(int id);

    List<Saal> searchSaalsByCapacity(int capacity);
}
