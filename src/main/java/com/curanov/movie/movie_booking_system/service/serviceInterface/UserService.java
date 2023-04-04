package com.curanov.movie.movie_booking_system.service.serviceInterface;

import com.curanov.movie.movie_booking_system.entity.User;

import java.util.List;

public interface UserService {
    User getUserById(int id);
    User saveUser(User user);
    void deleteUserById(int id);
    List<User> searchUsersByName(String name);
}
