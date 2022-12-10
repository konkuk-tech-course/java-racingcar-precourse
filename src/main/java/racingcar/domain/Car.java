package racingcar.domain;

import constant.Constants;

public class Car {
    private static final int UNIT_DISTANCE = 1;

    private String name;
    private int position = Constants.INIT_VALUE.get();

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        position += UNIT_DISTANCE;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
