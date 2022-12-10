package racingcar.ui;

import java.util.StringJoiner;
import racingcar.util.Command;

public class OutputView {
    private static final StringJoiner joiner = new StringJoiner(", ") ;
    private static final String COLON = " : " ;

    public void printCarPosition(String carName, String carPosition){
        printMessage(carName + COLON + carPosition);
    }

    public void printGameWinner(String ... winners){
        for(String winner : winners){
            joiner.add(winner) ;
        }
        printMessage(Command.WINNER_MESSAGE.getMessage()+ COLON + joiner);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
