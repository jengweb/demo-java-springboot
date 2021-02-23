package com.example.workshop01;

public class BuzzRule implements Rule {
    public boolean check(int number) {
        return number % 5 == 0;
    }

    public String say() {
        return "Buzz";
    }
}
