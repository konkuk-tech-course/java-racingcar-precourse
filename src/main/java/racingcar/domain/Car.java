package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.view.OutputView;

public class Car {
    private final String name;
    private int position = 0;
    private String trace ="";

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현

    public void carSetting(){
        int i = Randoms.pickNumberInRange(0, 9);
        if(i>=4){
            this.position++;
            trace +="-";
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
