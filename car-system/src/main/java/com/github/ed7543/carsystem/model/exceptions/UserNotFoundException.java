package com.github.ed7543.carsystem.model.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String username) {
        super(String.format("User with username %s not found", username));
    }
}
