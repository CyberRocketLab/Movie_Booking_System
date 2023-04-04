package com.curanov.movie.movie_booking_system.service.serviceImplementation;

import com.curanov.movie.movie_booking_system.entity.Movie;
import com.curanov.movie.movie_booking_system.entity.User;
import com.curanov.movie.movie_booking_system.repository.UserRepository;
import com.curanov.movie.movie_booking_system.service.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    UserRepository userRepository;

    public UserServiceImplementation(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found!"));
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found!"));

        userRepository.deleteById(id);
    }

    @Override
    public List<User> searchUsersByName(String name) {
        List<User> userList = userRepository.findUserByName(name);

        if(userList.isEmpty()) {
            throw new IllegalArgumentException("Movie not found");
        }

        return userList;
    }
}
