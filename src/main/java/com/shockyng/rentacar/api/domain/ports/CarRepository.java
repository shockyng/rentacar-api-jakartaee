package com.shockyng.rentacar.api.domain.ports;

import com.shockyng.rentacar.api.domain.entities.Car;

public interface CarRepository {

    Car save(Car car);
}
