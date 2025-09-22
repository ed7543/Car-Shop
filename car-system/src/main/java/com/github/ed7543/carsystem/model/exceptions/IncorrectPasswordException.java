package com.github.ed7543.carsystem.model.exceptions;

public class IncorrectPasswordException extends RuntimeException {

    public IncorrectPasswordException() {
        super("The password is incorrect.");
    }

}
