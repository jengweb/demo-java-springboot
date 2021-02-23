package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public interface Promotion {
    void calculate();
}
@Component
//@Primary
class Promotion1 implements Promotion{
    @Autowired
    public void calculate(){

    }
}

@Component
class Promotion2 implements Promotion{
    @Autowired
    public void calculate(){

    }
}