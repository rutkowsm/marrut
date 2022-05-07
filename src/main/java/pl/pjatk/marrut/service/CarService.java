package pl.pjatk.marrut.service;

import org.springframework.stereotype.Service;
import pl.pjatk.marrut.Car;

@Service

public class CarService {

    public String getModel() {
        return model;
    }

    public void createCar(String model) {
        Car car = new Car(model);
    }


}
