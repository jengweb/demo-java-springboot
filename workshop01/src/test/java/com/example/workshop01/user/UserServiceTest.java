package com.example.workshop01.user;

import static org.mockito.BDDMockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Test
    public void user_found_with_id_1() {
        MyUser jengweb = new MyUser(1, "Jengweb", 34);
        when(userRepository.findById(1))
                .thenReturn(Optional.of(jengweb));
        UserService userService = new UserService(userRepository);
        UserResponse userResponse = userService.findById(1);
        assertEquals(1, userResponse.getId());
    }

    @Test
    public void user_not_found_with_id_0() {
        when(userRepository.findById(0))
                .thenReturn(Optional.empty());
        UserService userService = new UserService(userRepository);
        Exception exception = assertThrows(UserNotFoundException.class, () -> {
            userService.findById(0);
        });
        assertEquals("User not found with id=0", exception.getMessage());
    }

}