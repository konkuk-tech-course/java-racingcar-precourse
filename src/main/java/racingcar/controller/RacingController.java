package racingcar.controller;

import racingcar.domain.Validator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    InputView inputView;
    OutputView outputView;
    Validator validator;

    public RacingController(InputView inputView, OutputView outputView) {
        this.validator = new Validator();
    }


    public void run(){
        validateCarName();
    }

    private void validateCarName() {
        try{
            String s = validator.validateCarName(inputView.readCarName());
        }catch (IllegalArgumentException e){

        }
    }


}
