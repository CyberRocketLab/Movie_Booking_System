package com.curanov.movie.movie_booking_system.repository;


import com.curanov.movie.movie_booking_system.entity.Saal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaalRepository extends JpaRepository<Saal, Integer> {

    List<Saal> findBySeatsGreaterThanEqual(int seats);
}
