package com.example.workshop01;

import org.springframework.stereotype.Component;

@Component
public class Demo {

    private String name;

    public void hi() {
        System.out.println("Say hi " + getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
