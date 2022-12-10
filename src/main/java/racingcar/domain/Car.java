package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.view.OutputView;

public class Car {
    private final String name;

    private final String MOVE="-";
    private int position = 0;
    private String trace ="";

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현

    public void carMovingProcess(){
        int number = Randoms.pickNumberInRange(0, 9);
        if(number>=4){
            this.position++;
            this.trace +=MOVE;
        }
    }

    public void printPosition(OutputView outputView) {
        outputView.printTrace(this.name, this.trace);
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }
}
