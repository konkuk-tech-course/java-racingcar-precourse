package racingcar.domain.validator;

import racingcar.util.Error;

public class NameValidator extends Validator{
    private static final int MAX_LENGTH = 5;
    @Override
    public void validate(String inputValue) {
        super.validate(inputValue);
        validateLength(inputValue);
    }
    private void validateLength(String inputValue){
        if(inputValue.length() > MAX_LENGTH){
            throw new IllegalArgumentException(Error.OVER_LENGTH.getMessage());
        }
    }
}
