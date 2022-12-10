package racingcar.view.constant;

public enum OutputPhrase {
    WINNER("최종 우승자 : %s");

    private final String phrase;

    private OutputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String get() {
        return phrase;
    }
}