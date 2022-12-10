package racingcar.view.constant;

public enum OutputPhrase {
    RESULT_TITLE("실행 결과"),
    WINNER("최종 우승자 : %s");

    private final String phrase;

    private OutputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String get() {
        return phrase;
    }
}