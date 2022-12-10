package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.view.constant.ViewConstant;

public class OutputView {

    private final String DELEMETER = ViewConstant.INIT_DELEMETER.message();

    public void printException(String message) {
        System.out.println(message);
    }

    public void printInputCarName() {
        System.out.println(ViewConstant.INPUT_CAR_NAME.message());
    }

    public void printInputTrial() {
        System.out.println(ViewConstant.INPUT_TRIAL.message());
    }

    public void printTrace(String name, String trace) {
        System.out.printf(ViewConstant.TRACE.message(), name, trace);
    }


    public void printWinningMember(List<String> winningMember) {
        String winningMembers = getWinningMembers(winningMember);
        System.out.print(ViewConstant.WINNER.message());
        System.out.println(winningMembers);
    }

    private String getWinningMembers(List<String> winningMember) {
        String winningMembers = winningMember.stream().collect(Collectors.joining(DELEMETER));
        return winningMembers;
    }

}
