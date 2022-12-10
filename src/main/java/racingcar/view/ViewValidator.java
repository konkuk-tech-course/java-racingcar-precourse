package racingcar.view;

import racingcar.view.constant.InputErrorMessage;
import racingcar.view.constant.InputLimits;
import racingcar.view.constant.ValidationRegex;

import java.util.regex.Pattern;

public class ViewValidator {
    public static void validateName(String nameInput) {
        if (isEmpty(nameInput)) {
            throw new IllegalArgumentException(InputErrorMessage.EMPTY.get());
        }

        if (!isCorrectLength(nameInput)) {
            throw new IllegalArgumentException(InputErrorMessage.INVALID_NAME_LENGTH.get());
        }
    }

    private static boolean isEmpty(String input) {
        return Pattern.matches(ValidationRegex.EMPTY.get(), input);
    }

    private static boolean isCorrectLength(String input) {
        return input.length() <= InputLimits.NAME_LENGTH.get();
    }

    private static boolean isNumber(String input) {
        return Pattern.matches(ValidationRegex.NUMBER.get(), input);
    }
}
