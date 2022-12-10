package racingcar.view.constant;

public enum InputErrorMessage {
    EMPTY("빈 값을 입력했습니다."),
    EMPTY_VALUE_IN_NAMES("입력된 값들 중 빈 값이 포함되어 있습니다."),
    NOT_NUMBER("숫자만 입력해주세요");

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    private InputErrorMessage(String message) {
        this.message = message;
    }

    public String get() {
        return PREFIX + message;
    }
}
