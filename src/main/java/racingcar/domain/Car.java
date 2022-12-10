package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.constant.CarConstant;
import racingcar.view.OutputView;

public class Car {


    private final String name;
    private String trace=CarConstant.INIT_TRACE.getState();
    private int position = 0;


    public Car(String name) {
        this.name = name;
    }

    public void MoveOrStopAccordingToRandomNumber(){
        int number = Randoms.pickNumberInRange(CarConstant.START_RANGE.getStateNumber(), CarConstant.END_RANGE.getStateNumber());
        if(number>=CarConstant.CAPABLE_MOVE_NUMBER.getStateNumber()){
            this.position++;
            this.trace +=CarConstant.MOVE.getState();
        }
    }

    public void printUntilNowPosition(OutputView outputView) {
        outputView.printTrace(this.name, this.trace);
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }
}
