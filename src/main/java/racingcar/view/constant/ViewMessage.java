package racingcar.view.constant;// @ author ninaaano

public enum ViewMessage {
    INPUT_GAME_START_MESSAGE("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_USER_TRY_COUNT("시도할 회수는 몇회인가요?"),
    OUTPUT_RESULT_MESSAGE("실행 결과\n"),
    OUTPUT_RESULT_WINNER("최종 우승자 :")
    ;

    private final String message;

    ViewMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }



}
