package com.github.ed7543.carsystem.dto.domain;

import com.github.ed7543.carsystem.model.domain.User;
import com.github.ed7543.carsystem.model.enums.Role;

public record RegisterUserResponseDto(
        String username,
        String name,
        String surname,
        String email,
        Role role
) {

    public static RegisterUserResponseDto from(User user) {
        return new RegisterUserResponseDto(
                user.getUsername(),
                user.getName(),
                user.getSurname(),
                user.getEmail(),
                user.getRole()
        );
    }

}