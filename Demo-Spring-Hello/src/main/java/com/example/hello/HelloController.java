package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public HelloResponse sayHi() {
        HelloResponse helloResponse = new HelloResponse();
        helloResponse.setMessage("Hello");
        return helloResponse;
    }
}
