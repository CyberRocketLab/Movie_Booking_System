package com.curanov.movie.movie_booking_system.service.serviceImplementation;

import com.curanov.movie.movie_booking_system.entity.Saal;
import com.curanov.movie.movie_booking_system.entity.User;
import com.curanov.movie.movie_booking_system.repository.SaalRepository;
import com.curanov.movie.movie_booking_system.service.serviceInterface.SaalService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SaalServiceImplementation implements SaalService {

    SaalRepository saalRepository;

    public SaalServiceImplementation(@Autowired SaalRepository saalRepository) {
        this.saalRepository = saalRepository;
    }

    @Override
    public List<Saal> getAllSaals() {
        List<Saal> saalList = saalRepository.findAll();

        if (saalList.isEmpty())
            throw new IllegalArgumentException("Saal not Found!");

        return null;
    }

    @Override
    public Saal getSaalById(int id) {
        return saalRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Saal not found!"));
    }

    @Override
    public Saal saveSaal(Saal saal) {
        return saalRepository.save(saal);
    }

    @Override
    public void deleteSaalById(int id) {
        saalRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Saal not found!"));

        saalRepository.deleteById(id);
    }

    @Override
    public List<Saal> searchSaalsByCapacity(int capacity) {
        List<Saal> saalList = saalRepository.findBySeatsGreaterThanEqual(capacity);

        if(saalList.isEmpty()) {
            throw new IllegalArgumentException("Saal not found");
        }

        return saalList;
    }
}
