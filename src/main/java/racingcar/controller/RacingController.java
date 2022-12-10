package racingcar.controller;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.Game;
import racingcar.domain.Validator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    private InputView inputView;
    private OutputView outputView;
    private Validator validator;

    public RacingController(InputView inputView, OutputView outputView) {
        this.inputView=inputView;
        this.outputView=outputView;
        this.validator = new Validator();
    }


    public void run(){
        List<Car> cars = validateCarName();
        int trial = validateInputTrial();
        Game game = new Game(cars,trial,outputView);
        game.play();
    }

    private int validateInputTrial() {
        int trial=0;
        try{
            outputView.printInputTrial();
            trial = validator.validateInputTrial(inputView.readTrial());
        }catch (IllegalArgumentException e){
            outputView.printException(e.getMessage());
            return validateInputTrial();
        }
        return trial;
    }

    private List<Car> validateCarName() {
        List<Car> cars= new ArrayList<>();
        try{
            outputView.printInputCarName();
            cars = validator.validateCarName(inputView.readCarName());
        }catch (IllegalArgumentException e){
            outputView.printException(e.getMessage());
            return validateCarName();
        }
        return cars;
    }


}
