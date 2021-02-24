package com.example.workshop01.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserController3Test {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private UserService userService;

    @Test
    public void success_found_user_1_with_mock() {
        // Prepare data
        UserResponse userResponse = new UserResponse(1, "somkiat", 40);
        when(userService.findById(1))
                .thenReturn(userResponse);
        // Test
        UserResponse result
                = restTemplate.getForObject("/users/1", UserResponse.class);
        assertEquals(1, result.getId());
        assertEquals("somkiat", result.getName());
        assertEquals(40, result.getAge());
    }

    @Test
    public void user_not_found_with_mock() {
        // Prepare data
        when(userService.findById(0))
                .thenThrow(new UserNotFoundException("User not found with id=0"));
        // Testing
        ErrorResponse result
                = restTemplate.getForObject("/users/0", ErrorResponse.class);
        assertEquals(4567, result.getCode());
        assertEquals("User not found with id=0", result.getMessage());
    }

}