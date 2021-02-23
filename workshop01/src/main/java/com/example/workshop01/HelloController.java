package com.example.workshop01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Message sayHi() {
        return new Message("Hello world");
    }

}
