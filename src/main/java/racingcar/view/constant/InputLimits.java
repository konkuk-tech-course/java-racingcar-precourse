package racingcar.view.constant;

public enum InputLimits {
    NAME_LENGTH(5);

    private final int limit;

    private InputLimits(int limit) {
        this.limit = limit;
    }

    public int get() {
        return limit;
    }
}
