package com.example.workshop01.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse findById(int id) {
        Optional<MyUser> result = userRepository.findById(id);
        if (result.isPresent()) {
            // Found
            UserResponse userResponse = new UserResponse(
                    result.get().getId(), result.get().getName(), result.get().getAge());
            return userResponse;
        } else {
            // Not found
            throw new UserNotFoundException("User not found with id=" + id);
        }
    }
}
