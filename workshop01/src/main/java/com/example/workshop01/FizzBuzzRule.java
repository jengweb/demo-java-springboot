package com.example.workshop01;

public class FizzBuzzRule implements Rule {
    public boolean check(int number) {
        return number % 15 == 0;
    }

    public String say() {
        return "FizzBuzz";
    }
}
