package racingcar.view;// @ author ninaaano

import racingcar.view.constant.ViewMessage;

public class OutputView {

    public void printResult() {
        System.out.println(ViewMessage.OUTPUT_RESULT_MESSAGE.getMessage());

    }

    public void printWinner(){
        System.out.print(ViewMessage.OUTPUT_RESULT_WINNER.getMessage());
    }
}
