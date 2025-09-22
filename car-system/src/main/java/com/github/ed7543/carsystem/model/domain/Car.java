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
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String make;

    @Column(nullable = false)
    private String model;

    private Integer year;

    private Double price;

    private Double mileage;

    private String description;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<CarImage> images;

    @ManyToOne
    @JoinColumn(name = "dealership_id")
    private Dealership dealership;

    public Car() {}

    public Car(String make, String model, Integer year, Double price, Double mileage, String description) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.description = description;
        images = new ArrayList<>();
    }

    public void increasePrice() { price++; }
    public void decreasePrice() { price--; }

}
