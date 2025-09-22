package com.github.ed7543.carsystem.dto.domain;

import com.github.ed7543.carsystem.model.domain.Car;
import com.github.ed7543.carsystem.model.domain.CarImage;
import com.github.ed7543.carsystem.model.domain.Dealership;

import java.util.List;

public record DisplayCarDetailsDto(
        Long id,
        String make,
        String model,
        Integer year,
        Double price,
        Double mileage,
        String description,
        DisplayDealershipDto dealership,
        List<DisplayCarImageDto> images

        ) {
    public static DisplayCarDetailsDto from(Car car) {
        return new DisplayCarDetailsDto(
                car.getId(),
                car.getMake(),
                car.getModel(),
                car.getYear(),
                car.getPrice(),
                car.getMileage(),
                car.getDescription(),
                DisplayDealershipDto.from(car.getDealership()),
                DisplayCarImageDto.from(car.getImages())
        );
    }

}
