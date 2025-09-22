package com.github.ed7543.carsystem.service.domain;


import com.github.ed7543.carsystem.model.domain.Dealership;

import java.util.List;
import java.util.Optional;

public interface DealershipService {
    List<Dealership> findAll();

    Optional<Dealership> findById(Long id);

    Dealership save(Dealership dealership);

    Optional<Dealership> update(Long id, Dealership dealership);

    Optional<Dealership> deleteById(Long id);
}
