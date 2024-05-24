package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Model S", "Tesla", 2020));
        cars.add(new Car("Mustang", "Ford", 2018));
        cars.add(new Car("Civic", "Honda", 2019));
        cars.add(new Car("Camry", "Toyota", 2021));
        cars.add(new Car("A4", "Audi", 2017));

    }
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
