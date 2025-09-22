package com.github.ed7543.carsystem.dto.domain;

import com.github.ed7543.carsystem.model.domain.Dealership;

public record CreateDealershipDto(
        String name,
        String email,
        String address,
        String phone
) {

    public Dealership toDealership() { return new Dealership(name, email, address, phone); }
}
