package racingcar.view.constant;

public enum InputPhrase {
    NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표("
            + InputProperties.DELIMITER.get()
            +") 기준으로 구분)"),
    TRY("시도할 회수는 몇회인가요?");

    private final String phrase;

    private InputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String get() {
        return phrase;
    }
}
