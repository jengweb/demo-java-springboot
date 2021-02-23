package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class GenerateService {

    @Autowired
    private Promotion promotion2;

    public void sayHi() {
        System.out.println("Called SayHi");
    }
}

@Component
class MainComponent {
    @Autowired
    private GenerateService generateService;
    public void start(){
        generateService.sayHi();
    }
}