package com.shockyng.rentacar.api.adapters.dto;

import com.shockyng.rentacar.api.domain.entities.Car;

public class CarDTO {

    private String name;

    public CarDTO() {
    }

    public Car toCar() {
        return new Car(name);
    }

    public CarDTO(Car car) {
        this.name = car.getName();
    }
}
