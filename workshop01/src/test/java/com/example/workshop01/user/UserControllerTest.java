package com.example.workshop01.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void success_found_user_1() {
        UserResponse result
                = restTemplate.getForObject("/users/1", UserResponse.class);
        assertEquals(1, result.getId());
        assertEquals("somkiat", result.getName());
        assertEquals(40, result.getAge());
    }

    @Test
    public void get_all_user_with_size_3() {
        List<LinkedHashMap> result
                = restTemplate.getForObject("/users", List.class);
        assertEquals(3, result.size());
        Map mapResult = result.get(2);
        assertEquals(3, mapResult.get("id"));
        assertEquals("somkiat", mapResult.get("name"));
    }

}