package racingcar;

import racingcar.controller.GameController;
import racingcar.domain.Game;

public class Application {
    public static void main(String[] args) {
        final GameController gameController = GameController.getInstance();
        Game game = gameController.createGame();
        gameController.operate(game);
    }
}
