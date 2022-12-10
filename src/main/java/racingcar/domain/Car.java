package racingcar.domain;

import constant.Constants;

public class Car {
    private static final int UNIT_DISTANCE = 1;

    private String name;
    private int distance;

    public Car(String name) {
        this.name = name;
        this.distance = Constants.INIT_VALUE.get();
    }

    public void move() {
        distance += UNIT_DISTANCE;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
