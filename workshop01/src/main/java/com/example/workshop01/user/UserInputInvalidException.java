package com.example.workshop01.user;

public class UserInputInvalidException extends RuntimeException {
    public UserInputInvalidException(String s) {
        super(s);
    }
}
