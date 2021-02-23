package com.example.workshop01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void success_hello() {
        Message result =
                testRestTemplate.getForObject("/hello", Message.class);
        assertEquals("Hello world", result.getMessage());

        Message expected = new Message("Hello world");
        assertEquals(expected, result);
    }

}