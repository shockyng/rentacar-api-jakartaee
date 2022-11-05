package com.shockyng.rentacar.api.adapters.api;

import com.shockyng.rentacar.api.adapters.db.CarJPARepository;
import com.shockyng.rentacar.api.adapters.dto.CarDTO;
import com.shockyng.rentacar.api.domain.entities.Car;
import com.shockyng.rentacar.api.domain.ports.CarRepository;
import com.shockyng.rentacar.api.domain.services.cars.CreateNewCar;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/v1/cars")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CarsResource {

    private final CarRepository carRepository = new CarJPARepository();

    @POST
    public CarDTO createNewCar(CarDTO carDTO) {
        CreateNewCar createNewCar = new CreateNewCar(carRepository);
        Car car = createNewCar.execute(carDTO.toCar());
        return new CarDTO(car);
    }
}
