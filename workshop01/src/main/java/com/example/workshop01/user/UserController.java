package com.example.workshop01.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public UserResponse getById(@PathVariable int id) {
        UserResponse userResponse = new UserResponse(id, "somkiat", 40);
        return userResponse;
    }

}
