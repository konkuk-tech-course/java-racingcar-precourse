package racingcar.domain;

import constant.Constants;

import java.util.*;
import java.util.stream.Collectors;

public class Game {
    private int remainingMoves;
    private Map<String, Car> cars;

    public Game(int remainingMoves) {
        this.remainingMoves = remainingMoves;
        cars = new HashMap<>();
    }

    public void addCar(Car car) {
        cars.put(car.getName(), car);
    }

    public void controlCars(Map<String, Boolean> moves) {
        remainingMoves--;
        moves.entrySet().stream()
                .filter(Map.Entry::getValue)
                .map(Map.Entry::getKey)
                .forEach(name -> cars.get(name).move());
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

    public Map<String, Integer> createGameStatus() {
        Map<String, Integer> gameStatus = new HashMap<>();
        cars.forEach((key, value) -> gameStatus.put(
                key,
                value.getPosition()
        ));
        return gameStatus;
    }

    public Set<String> getAllCars() {
        return cars.keySet();
    }
}
