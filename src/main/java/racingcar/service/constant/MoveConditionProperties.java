package racingcar.service.constant;

public enum MoveConditionProperties {
    MIN(0),
    MAX(9),
    MIN_MOVABLE(4);

    private final int property;

    private MoveConditionProperties(int property) {
        this.property = property;
    }

    public int get() {
        return property;
    }
}
