package com.example.workshop01;

public class WowRule implements Rule {
    @Override
    public boolean check(int number) {
        return number == 4;
    }

    @Override
    public String say() {
        return "Wow";
    }
}
