package racingcar.domain.validator;

import racingcar.util.Error;

public class NameValidator extends Validator{
    private static final int MAX_LENGTH = 5;
    @Override
    public void validate(String inputValue) {
        super.validate(inputValue);
        for(String name : inputValue.split(",")){
            validateLength(name.trim());
        }
    }
    private void validateLength(String inputValue){
        if(inputValue.length() > MAX_LENGTH){
            throw new IllegalArgumentException(Error.OVER_LENGTH.getMessage());
        }
    }

    public static void main(String[] args) {
        NameValidator validator = new NameValidator();
        String inputValue = "pobi, woni, jun";
        try{
            for(String name : inputValue.split(",")){
                validator.validateLength(name);
            }
        }catch (IllegalArgumentException ie){
            System.out.println(ie.getMessage());
        }


    }
}
