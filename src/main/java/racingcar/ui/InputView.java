package racingcar.ui;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.validator.NameValidator;
import racingcar.domain.validator.TrialValidator;
import racingcar.util.Command;

public class InputView {
    private final OutputView out;
    private final NameValidator nameValidator;
    private final TrialValidator trialValidator;

    public InputView(OutputView outputView){
        out = outputView;
        nameValidator = new NameValidator();
        trialValidator = new TrialValidator();
    }


    public List<String> getCarNames(){
        out.printMessage(Command.REQUEST_NAME.getMessage());
        String carNames;
        do{
            carNames = Console.readLine();
        }while (!checkCarName(carNames));
        return Arrays.stream(carNames.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }
    private boolean checkCarName(String carNames){
        try{
            nameValidator.validate(carNames);
            return true;
        }catch (IllegalArgumentException ie){
            out.printMessage(ie.getMessage());
            return false;
        }
    }

    public int getTrial(){
        out.printMessage(Command.REQUEST_TRIAL.getMessage());
        String trialInput;
        do{
            trialInput = Console.readLine();
        }while (!checkTrial(trialInput));
        return Integer.parseInt(trialInput.trim());
    }
    private boolean checkTrial(String trialInput){
        try{
            trialValidator.validate(trialInput);
        }catch (IllegalArgumentException ie){
            out.printMessage(ie.getMessage());
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        InputView in = new InputView(new OutputView());
        System.out.println(in.getCarNames());
    }
}
