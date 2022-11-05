package com.shockyng.rentacar.api.adapters.db;

import com.shockyng.rentacar.api.domain.entities.Car;
import com.shockyng.rentacar.api.domain.ports.CarRepository;

public class CarJPARepository extends AbstractRepository<Car, Long> implements CarRepository {

    @Override
    public String getClassName() {
        return Car.class.getName();
    }

    @Override
    public Car save(Car car) {
        return super.save(car);
    }
}
