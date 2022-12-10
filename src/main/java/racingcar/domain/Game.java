package racingcar.domain;

import constant.Constants;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Game {
    private int moveCount;
    private Map<String, Car> cars;

    public Game() {
        moveCount = Constants.INIT_VALUE.get();
        cars = new HashMap<>();
    }

    public void addCar(Car car) {
        cars.put(car.getName(), car);
    }

    public void controlCar(String name, boolean canMove) {
        if (canMove) {
            cars.get(name).move();
        }
    }

    public Set<String> getAllCars() {
        return cars.keySet();
    }
}
