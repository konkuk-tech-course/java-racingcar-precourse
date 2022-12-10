package racingcar.view;

public class OutputView {
    private static class InstanceHolder {
        private static final OutputView INSTANCE = new OutputView();
    }

    public static OutputView getInstance() {
        return OutputView.InstanceHolder.INSTANCE;
    }
    
}
