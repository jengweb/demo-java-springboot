package com.example.workshop01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class WorkshopTest {

    class Random8 implements MyRandom{
        @Override
        public int nextInt(int bound) {
            return 8;
        }
    }

    @Test
    public void second_case() {
        GenerateDataService g
                = new GenerateDataService();
        // Method injection
        String result = g.getData(new Random8());
        assertEquals("somkiat8", result);
    }

    @Test
    public void third_case() {
        GenerateDataService g
                = new GenerateDataService();
        try {
            // Method injection
            String result = g.getData(new MyRandom() {
                @Override
                public int nextInt(int bound) {
                    return 0;
                }
            });
            fail();
        }catch (Exception e) {

        }
    }

    @Test
    @DisplayName("สวัสดี junit 5 นะ")
    public void first_case() {
        Hello hello = new Hello();
        String result = hello.sayHi("somkiat");
        assertEquals("Hello somkiat", result);
    }

}
