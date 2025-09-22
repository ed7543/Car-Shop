package com.github.ed7543.carsystem.model.exceptions;

public class DealershipNotFoundException extends RuntimeException {
    public DealershipNotFoundException(Long id) {
        super(String.format("Dealership with id %d not found", id));
    }
}
