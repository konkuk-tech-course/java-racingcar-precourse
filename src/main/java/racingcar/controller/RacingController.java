package racingcar.controller;

import java.util.ArrayList;
import java.util.List;
import racingcar.Car;
import racingcar.domain.Validator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    InputView inputView;
    OutputView outputView;
    Validator validator;

    public RacingController(InputView inputView, OutputView outputView) {
        this.inputView=inputView;
        this.outputView=outputView;
        this.validator = new Validator();
    }


    public void run(){
        List<Car> cars = validateCarName();
        int trial = validateInputTrial();
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
        List<Car> carList= new ArrayList<>();
        try{
            outputView.printInputCarName();
            carList = validator.validateCarName(inputView.readCarName());
        }catch (IllegalArgumentException e){
            outputView.printException(e.getMessage());
            return validateCarName();
        }
        return carList;
    }


}
