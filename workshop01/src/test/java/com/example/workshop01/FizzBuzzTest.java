package com.example.workshop01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    @DisplayName("นับ 1 ได้ 1")
    public void case_1() {
        String actualResult = fizzBuzz.say(1);
        assertEquals("1", actualResult);
    }

    @Test
    @DisplayName("นับ 2 ได้ 2")
    public void case_2() {
        String actualResult = fizzBuzz.say(2);
        assertEquals("2", actualResult);
    }

    @Test
    @DisplayName("นับ 3 ได้ Fizz")
    public void case_3() {
        String actualResult = fizzBuzz.say(3);
        assertEquals("Fizz", actualResult);
    }

    @Test
    @DisplayName("นับ 4 ได้ Wow")
    public void case_4() {
        String actualResult = fizzBuzz.say(4);
        assertEquals("Wow", actualResult);
    }

    @Test
    @DisplayName("นับ 5 ได้ Buzz")
    public void case_5() {
        String actualResult = fizzBuzz.say(5);
        assertEquals("Buzz", actualResult);
    }

    @Test
    @DisplayName("นับ 6 ได้ Fizz")
    public void case_6() {
        String actualResult = fizzBuzz.say(6);
        assertEquals("Fizz", actualResult);
    }

    @Test
    @DisplayName("นับ 7 ได้ 7")
    public void case_7() {
        String actualResult = fizzBuzz.say(7);
        assertEquals("7", actualResult);
    }

    @Test
    @DisplayName("นับ 8 ได้ 8")
    public void case_8() {
        String actualResult = fizzBuzz.say(8);
        assertEquals("8", actualResult);
    }

    @Test
    @DisplayName("นับ 9 ได้ Fizz")
    public void case_9() {
        String actualResult = fizzBuzz.say(9);
        assertEquals("Fizz", actualResult);
    }

    @Test
    @DisplayName("นับ 10 ได้ Buzz")
    public void case_10() {
        String actualResult = fizzBuzz.say(10);
        assertEquals("Buzz", actualResult);
    }

    @Test
    @DisplayName("นับ 11 ได้ 11")
    public void case_11() {
        String actualResult = fizzBuzz.say(11);
        assertEquals("11", actualResult);
    }

    @Test
    @DisplayName("นับ 12 ได้ Fizz")
    public void case_12() {
        String actualResult = fizzBuzz.say(12);
        assertEquals("Fizz", actualResult);
    }

    @Test
    @DisplayName("นับ 13 ได้ 13")
    public void case_13() {
        String actualResult = fizzBuzz.say(13);
        assertEquals("13", actualResult);
    }

    @Test
    @DisplayName("นับ 14 ได้ 14")
    public void case_14() {
        String actualResult = fizzBuzz.say(14);
        assertEquals("14", actualResult);
    }
    
    @Test
    @DisplayName("นับ 15 ได้ FizzBuzz")
    public void case_15() {
        String actualResult = fizzBuzz.say(15);
        assertEquals("FizzBuzz", actualResult);
    }
}
