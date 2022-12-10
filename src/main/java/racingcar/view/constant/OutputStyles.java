package racingcar.view.constant;

public enum OutputStyles {
    MOVE("-"),
    RESULT_DELIMITER(" : "),
    WINNER_DELIMITER(", ");

    private final String style;

    private OutputStyles(String style) {
        this.style = style;
    }

    public String get() {
        return style;
    }
}
