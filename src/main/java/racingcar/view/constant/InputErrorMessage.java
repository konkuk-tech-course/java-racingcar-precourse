package racingcar.view.constant;

public enum InputErrorMessage {
    EMPTY("빈 값을 입력했습니다."),
    EMPTY_VALUE_IN_NAMES("입력된 값들 중 빈 값이 포함되어 있습니다."),
    INVALID_NAME_LENGTH("자동차 이름은 " + InputLimits.NAME_LENGTH.get() + "자 이하로 입력해주세요."),
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
