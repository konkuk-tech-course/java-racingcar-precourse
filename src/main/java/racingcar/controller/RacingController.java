package racingcar.controller;

import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.Game;
import racingcar.domain.Validator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    private final InputView inputView;
    private final OutputView outputView;
    private final Validator validator;

    public RacingController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.validator = new Validator();
    }


    public void run() {
        List<Car> cars = validateCarName();
        long trial = validateInputTrial();
        Game game = new Game(cars, trial, outputView);
        game.play();
    }

    private long validateInputTrial() {
        long trial;
        try {
            outputView.printInputTrial();
            trial = validator.validateInputTrial(inputView.readTrial());
        } catch (IllegalArgumentException e) {
            outputView.printException(e.getMessage());
            return validateInputTrial();
        }
        return trial;
    }

    private List<Car> validateCarName() {
        List<Car> cars;
        try {
            outputView.printInputCarName();
            cars = validator.validateCarName(inputView.readCarName());
        } catch (IllegalArgumentException e) {
            outputView.printException(e.getMessage());
            return validateCarName();
        }
        return cars;
    }


}
