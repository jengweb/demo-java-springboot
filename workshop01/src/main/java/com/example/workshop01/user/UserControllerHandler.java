package com.example.workshop01.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
// AOP :: Aspect Oriented Programming
@RestControllerAdvice
public class UserControllerHandler {

    @ExceptionHandler(UserInputInvalidException.class)
    public ResponseEntity<ErrorResponse> invalid(UserInputInvalidException e) {
        ErrorResponse errorResponse = new ErrorResponse(1234, e.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.OK);
    }

}
