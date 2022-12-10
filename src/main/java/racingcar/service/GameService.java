package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.domain.Game;
import racingcar.service.constant.MoveConditionProperties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GameService {
    private static class InstanceHolder {
        private static final GameService INSTANCE = new GameService();
    }

    public static GameService getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public Game createGame(List<String> names, int tryCount) {
        Game game = new Game(tryCount);
        names.forEach(name -> game.addCar(new Car(name)));
        return game;
    }

    public void playRound(Game game) {
        Map<String, Boolean> moveConditions = new HashMap<>();
        game.getAllCars().forEach(name -> moveConditions.put(name, isMovable()));
        game.controlCars(moveConditions);
    }

    private boolean isMovable() {
        int randomValue = Randoms.pickNumberInRange(
                MoveConditionProperties.MIN.get(),
                MoveConditionProperties.MAX.get()
        );
        return randomValue >= MoveConditionProperties.MIN_MOVABLE.get();
    }
}
