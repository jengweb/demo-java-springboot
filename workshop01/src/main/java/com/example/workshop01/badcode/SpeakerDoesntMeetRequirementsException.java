package com.example.workshop01.badcode;

public class SpeakerDoesntMeetRequirementsException extends RuntimeException {
    public SpeakerDoesntMeetRequirementsException(String message) {
        super(message);
    }
}