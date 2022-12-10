package racingcar.domain;

import constant.Constants;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int moveCount;
    private List<Car> cars;

    public Game() {
        moveCount = Constants.INIT_VALUE.get();
        cars = new ArrayList<>();
    }
    }
}
