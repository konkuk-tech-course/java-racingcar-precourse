package racingcar.domain.validator;

import racingcar.util.Error;

public class Validator {

    void validate(String inputValue){
        validateIsBlank(inputValue);
    }
    private void validateIsBlank(String inputValue){
        if (inputValue.isBlank()) {
            throw new IllegalArgumentException(Error.BLANK.getMessage());
        }
    }
}
