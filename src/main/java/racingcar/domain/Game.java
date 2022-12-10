package racingcar.domain;

import constant.Constants;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    public List<String> findLeadingCars() {
        if (cars.size() == Constants.INIT_VALUE.get()) {
            return new ArrayList<>();
        }
        return cars.values().stream()
                .filter(car -> car.getPosition() == calculateLeadingDistance())
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private int calculateLeadingDistance() {
        return cars.values().stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(Constants.ERROR_VALUE.get());
    }

    public Set<String> getAllCars() {
        return cars.keySet();
    }
}
