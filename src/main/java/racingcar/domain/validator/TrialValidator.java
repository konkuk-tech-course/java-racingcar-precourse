package racingcar.domain.validator;

import racingcar.util.Error;

public class TrialValidator extends Validator{
    @Override
    public void validate(String inputValue) {
        super.validate(inputValue);
        validateIsDigit(inputValue);
    }
    private void validateIsDigit(String inputValue){
        if (!inputValue.matches("\\d")) {
            throw new IllegalArgumentException(Error.NOT_NUMBER.getMessage());
        }
    }
}
