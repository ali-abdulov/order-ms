package com.ali.orderms.exceptions;

public class CourierNotAvailableException extends RuntimeException {
    public CourierNotAvailableException(String message) {
        super(message);
    }
}
