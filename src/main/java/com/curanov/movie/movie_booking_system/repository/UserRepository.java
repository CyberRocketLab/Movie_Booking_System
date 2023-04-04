package com.curanov.movie.movie_booking_system.repository;


import com.curanov.movie.movie_booking_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findUserByName(String name);
}
