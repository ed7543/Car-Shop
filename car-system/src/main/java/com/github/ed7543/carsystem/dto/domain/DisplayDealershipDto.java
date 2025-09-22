package com.github.ed7543.carsystem.dto.domain;

import com.github.ed7543.carsystem.model.domain.Dealership;

import java.util.List;

public record DisplayDealershipDto(
        Long id,
        String name,
        String email,
        String address,
        String phone
) {
    public static DisplayDealershipDto from(Dealership dealership) {
        return new DisplayDealershipDto(
                dealership.getId(),
                dealership.getName(),
                dealership.getEmail(),
                dealership.getAddress(),
                dealership.getPhone()
        );
    }

    public static List<DisplayDealershipDto> from(List<Dealership> dealerships) {
        return dealerships
                .stream()
                .map(DisplayDealershipDto::from)
                .toList();
    }
}
