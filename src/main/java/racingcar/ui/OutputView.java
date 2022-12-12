package racingcar.ui;

import java.util.List;
import java.util.StringJoiner;
import racingcar.util.Command;

public class OutputView {
    private static final String COLON = " : " ;
    private static final String COMMA = ", " ;

    public void printCarPosition(String carName, String carPosition){
        printMessage(carName + COLON + carPosition);
    }

    public void printGameWinner(List<String> winners){
        StringJoiner joiner = new StringJoiner(COMMA) ;
        for(String winner : winners){
            joiner.add(winner) ;
        }
        printMessage(Command.WINNER_MESSAGE.getMessage()+ COLON + joiner);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        OutputView out = new OutputView();
        out.printCarPosition("pobi", "--");
    }
}
