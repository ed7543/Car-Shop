package com.github.ed7543.carsystem.repository;

import com.github.ed7543.carsystem.model.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
