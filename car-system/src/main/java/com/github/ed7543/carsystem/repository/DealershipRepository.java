package com.github.ed7543.carsystem.repository;

import com.github.ed7543.carsystem.model.domain.Dealership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealershipRepository extends JpaRepository<Dealership, Long> {
}
