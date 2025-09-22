package com.github.ed7543.carsystem.service.domain;

import com.github.ed7543.carsystem.model.domain.CarImage;

import java.util.List;
import java.util.Optional;

public interface CarImageService {
    List<CarImage> findAll();
    List<CarImage> findAllByCarId(Long carId);
    Optional<CarImage> findById(Long id);
    CarImage addCarImage(Long carId, CarImage carImage);
    boolean deleteById(Long id);
    Optional<CarImage> updateCarImage(Long carId, CarImage newCarImage);
}
