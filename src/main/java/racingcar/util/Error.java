package racingcar.util;

public enum Error {
    OVER_LENGTH("[ERROR] 이름은 5자 이하여야 한다."),
    NOT_NUMBER("[ERROR] 이름은 5자 이하여야 한다."),
    BLANK("[ERROR] 공백은 허용되지 않는다.");

    private final String message ;

    Error(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}
