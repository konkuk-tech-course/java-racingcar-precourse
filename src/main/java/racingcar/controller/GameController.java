package racingcar.controller;

import racingcar.domain.Game;
import racingcar.service.GameService;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.constant.OutputPhrase;

import java.util.List;

public class GameController {
    private static InputView inputView = InputView.getInstance();
    private static OutputView outputView = OutputView.getInstance();
    private static GameService gameService = GameService.getInstance();

    private static class InstanceHolder {
        private static final GameController INSTANCE = new GameController();
    }

    public static GameController getInstance() {
        return GameController.InstanceHolder.INSTANCE;
    }

    public Game createGame() {
        List<String> names = requestNames();
        int tryCount = requestTryCount();
        outputView.insertLineBreak();
        return gameService.createGame(names, tryCount);
    }

    private List<String> requestNames() {
        try {
            return inputView.readNames();
        } catch (IllegalArgumentException e) {
            outputView.printMessage(e.getMessage());
            return requestNames();
        }
    }

    private int requestTryCount() {
        try {
            return inputView.readTryCount();
        } catch (IllegalArgumentException e) {
            outputView.printMessage(e.getMessage());
            return requestTryCount();
        }
    }

    public void operate(Game game) {
        outputView.printMessage(OutputPhrase.RESULT_TITLE.get());
        while(game.hasRemainingMoves()) {
            gameService.playRound(game);
            outputView.printResult(game.createGameStatus());
            outputView.insertLineBreak();
        }
        finish(game);
    }

    private void finish(Game game) {
        outputView.printWinners(game.findLeadingCars());
    }
}
