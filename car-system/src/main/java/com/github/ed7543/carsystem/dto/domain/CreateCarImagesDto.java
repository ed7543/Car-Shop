package com.github.ed7543.carsystem.dto.domain;

import com.github.ed7543.carsystem.model.domain.CarImage;

public record CreateCarImagesDto(
        String url
) {
    public CarImage toCarImage() {
        return new CarImage(null, url, null);
    }
}
