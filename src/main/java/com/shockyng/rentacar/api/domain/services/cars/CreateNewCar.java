package com.shockyng.rentacar.api.domain.services.cars;

import com.shockyng.rentacar.api.domain.entities.Car;
import com.shockyng.rentacar.api.domain.exceptions.CarNotFoundException;
import com.shockyng.rentacar.api.domain.ports.CarRepository;

public class CreateNewCar {

    private CarRepository carRepository;

    public CreateNewCar(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car execute(Car car) {
        Car carFromDB = carRepository.save(car);

        if (carFromDB == null) throw new CarNotFoundException();

        return carFromDB;
    }
}
