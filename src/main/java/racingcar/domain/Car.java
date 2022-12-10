package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.constant.CarConstant;
import racingcar.view.OutputView;

public class Car {

    private final String name;
    private String trace = CarConstant.INIT_TRACE.message();
    private int position = CarConstant.INIT_POSITION.stateNumber();


    public Car(String name) {
        this.name = name;
    }

    public void MoveOrStopAccordingToRandomNumber() {
        int randomMoveNumber = Randoms.pickNumberInRange(CarConstant.START_RANGE.stateNumber(),
            CarConstant.END_RANGE.stateNumber());
        if (randomMoveNumber >= CarConstant.CAPABLE_MOVE_NUMBER.stateNumber()) {
            this.position++;
            this.trace += CarConstant.MOVE.message();
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
