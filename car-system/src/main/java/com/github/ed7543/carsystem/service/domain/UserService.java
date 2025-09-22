package com.github.ed7543.carsystem.service.domain;

import com.github.ed7543.carsystem.model.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends UserDetailsService {
    User register(User user);

    User login(String username, String password);
    Optional<User> findByUsername(String username);
}

