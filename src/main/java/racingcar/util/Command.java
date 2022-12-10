package racingcar.util;

public enum Command {
    REQUEST_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    REQUEST_TRIAL("시도할 회수는 몇회인가요?"),
    EXECUTE_MESSAGE("실행 결과"),
    WINNER_MESSAGE("최종 우승자"),
    EMPTY_LINE("\n");

    private final String command ;

    Command(String command){
        this.command = command ;
    }

    public String getMessage(){
        return command ;
    }

}
