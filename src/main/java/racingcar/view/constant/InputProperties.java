package racingcar.view.constant;

public enum InputProperties {
    DELIMITER(",");

    private final String property;

    private InputProperties(String property) {
        this.property = property;
    }

    public String get() {
        return property;
    }
}
