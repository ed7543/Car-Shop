package com.github.ed7543.carsystem.model.exceptions;

public class CarNotFoundException extends RuntimeException  {
    public CarNotFoundException(Long id) {
    super(String.format("Car with id %d not found", id));
    }
}
