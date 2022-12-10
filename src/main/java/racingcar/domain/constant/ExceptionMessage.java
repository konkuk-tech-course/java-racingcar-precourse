package racingcar.domain.constant;

import java.util.List;

public enum ExceptionMessage {

    ERROR_NAME_LENGTH("[ERROR] 자동차에 대한 이름의 길이는 5 이하여야 합니다."),
    ERROR_INPUT_TRIAL("[ERROR] 시도 횟수는 숫자여야 한다.");


    private String exceptionMessage;

    ExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String message() {
        return exceptionMessage;
    }


}
