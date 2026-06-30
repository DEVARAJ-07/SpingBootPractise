package com.ngp.SpringBoot.Exception;

public class TrackerNotFoundException extends RuntimeException {
    public TrackerNotFoundException(String message) {
        super(message);
    }
}
