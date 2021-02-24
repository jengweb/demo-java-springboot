package com.example.workshop01.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserResponse findById(int id) {
        if (id >= 1) {
            // Found
            UserResponse userResponse = new UserResponse(id, "somkiat", 40);
            return userResponse;
        } else {
            // Not found
            throw new UserNotFoundException("User not found with id=" + id);
        }
    }
}
