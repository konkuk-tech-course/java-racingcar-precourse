package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {


    public void printException(String message) {
        System.out.println(message);
    }

    public void printInputCarName(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printInputTrial() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void printTrace(String name, String trace) {
        System.out.println(name + " : " + trace);
    }


}
