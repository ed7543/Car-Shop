package com.github.ed7543.carsystem.dto.domain;

import com.github.ed7543.carsystem.model.domain.CarImage;

import java.util.List;

public record DisplayCarImageDto(
        Long id,
        String url
) {
    public static DisplayCarImageDto from(CarImage image) {
        return new DisplayCarImageDto(image.getId(), image.getUrl());
    }

    public static List<DisplayCarImageDto> from(List<CarImage> images) {
        return images.stream().map(DisplayCarImageDto::from).toList();
    }
}
