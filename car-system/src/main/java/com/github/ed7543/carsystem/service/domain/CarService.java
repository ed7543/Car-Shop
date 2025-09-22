package com.github.ed7543.carsystem.service.domain;

import com.github.ed7543.carsystem.model.domain.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Car> findAll();

    Optional<Car> findById(Long id);

    Car save(Car car);

    Optional<Car> update(Long id, Car newCar);

    Car addCar(Car car, Long dealershipId);

    Optional<Car> removeById(Long id);
}
