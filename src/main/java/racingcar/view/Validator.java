package racingcar.view;// @ author ninaaano

public class Validator {

    private static final String IS_STRING = "[a-zA-Z]+$";
    private static final String IS_NUMBER = "[0-9]+$";
    private static final String ERROR = "[ERROR]";


    public static void validateInputName(String input) {
        if (!input.matches(IS_STRING)) {
            throw new IllegalArgumentException(ERROR + "문자만 입력할 수 있습니다");
        }
        if (input.length() > 5) {
            throw new IllegalArgumentException(ERROR + " 이름은 5자 이하만 입력 가능합니다");
        }
    }
    public static void validateInputTryNumber(int count) {
        if(count <= 0)  {
            throw new IllegalArgumentException(ERROR+ "시도 횟수는 0 이상이여야 합니다");
        }
    }



}
