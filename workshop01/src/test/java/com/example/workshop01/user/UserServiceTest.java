package com.example.workshop01.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Test
    public void user_not_found_with_id_0() {
        UserService userService = new UserService();
        Exception exception = assertThrows(UserNotFoundException.class, () -> {
            userService.findById(0);
        });
        assertEquals("User not found with id=0", exception.getMessage());
    }

}