package racingcar.view.constant;

public enum ViewConstant {


    INPUT_CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_TRIAL("시도할 회수는 몇회인가요?"),
    TRACE("%s : %s\n"),
    WINNER("최종 우승자 : "),
    INIT_DELEMETER(",");


    private String constant;

    ViewConstant(String constant) {
        this.constant = constant;
    }

    public String message() {
        return constant;
    }


}
