package racingcar.view;

import racingcar.view.constant.OutputStyles;

import java.util.Map;

public class OutputView {
    private static class InstanceHolder {
        private static final OutputView INSTANCE = new OutputView();
    }

    public static OutputView getInstance() {
        return OutputView.InstanceHolder.INSTANCE;
    }

    public void printResult(Map<String, Integer> results) {
        results.entrySet().stream()
                .map(this::styleResult)
                .forEach(System.out::println);
    }

    private String styleResult(Map.Entry<String, Integer> result) {
        return String.join(
                OutputStyles.RESULT_DELIMITER.get(),
                result.getKey(),
                OutputStyles.MOVE.get().repeat(result.getValue())
        );
    }

    public void printWinners() {

    }
}
