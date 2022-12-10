package racingcar.domain;

import constant.Constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private int moveCount;
    private Map<String, Car> cars;

    public Game() {
        moveCount = Constants.INIT_VALUE.get();
        cars = new HashMap<>();
    }
    }
}
