package com.github.ed7543.carsystem.dto.domain;

import com.github.ed7543.carsystem.model.domain.User;

public record RegisterUserRequestDto(
        String username,
        String password,
        String name,
        String surname,
        String email
) {

    public User toUser() {
        return new User(username, password, name, surname, email);
    }

}
