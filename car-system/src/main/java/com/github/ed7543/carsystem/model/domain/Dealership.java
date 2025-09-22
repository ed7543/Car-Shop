package com.github.ed7543.carsystem.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
public class Dealership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String address;

    private String phone;

    @OneToMany(mappedBy = "dealership", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Car> cars;

    public Dealership() {}

    public Dealership(String name, String email, String address, String phone) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        cars = new ArrayList<>();
    }
}
