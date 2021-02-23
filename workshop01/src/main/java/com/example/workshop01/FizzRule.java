package com.example.workshop01;

public class FizzRule implements Rule {
    @Override
    public boolean check(int number) {
        return number % 3 == 0;
    }

    @Override
    public String say() {
        return "Fizz";
    }
}
