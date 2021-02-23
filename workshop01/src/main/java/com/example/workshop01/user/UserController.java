package com.example.workshop01.user;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public UserResponse getById(@PathVariable int id) {
        UserResponse userResponse = new UserResponse(id, "Jengweb", 34);
        return userResponse;
    }

    @GetMapping("/users")
    public List<UserResponse> getAlll() {
        UserResponse user1 = new UserResponse(1, "Jengweb", 34);
        UserResponse user2 = new UserResponse(2, "Parkiid", 34);
        UserResponse user3 = new UserResponse(3, "Somkiat", 40);
        List<UserResponse> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }

    @PostMapping("/users")
    public UserResponse createNewUser(@RequestBody UserRequest newUser) {
        // Validate input
        // Generate result
        UserResponse newUserResponse = new UserResponse(
                1,
                newUser.getName(),
                newUser.getAge());
        return newUserResponse;
    }



}
