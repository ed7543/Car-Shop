package com.github.ed7543.carsystem.dto.domain;

import com.github.ed7543.carsystem.model.domain.Car;

public record CreateCarDto(
        String make,
        String model,
        Integer year,
        Double price,
        Double mileage,
        String description
) {

    public Car toCar() {
        return new Car(make, model, year, price, mileage, description);
    }

}
