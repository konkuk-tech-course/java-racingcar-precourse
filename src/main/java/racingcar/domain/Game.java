package racingcar.domain;

import constant.Constants;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int moveCount;
    private List<Car> Cars;

    public Game() {
        moveCount = Constants.INIT_VALUE.get();
        Cars = new ArrayList<>();
    }
}
