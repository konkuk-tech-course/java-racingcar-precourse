package racingcar.domain.constant;

public enum CarConstant {


    MOVE("-"),

    INIT_TRACE(""),
    CAPABLE_MOVE_NUMBER(4),
    START_RANGE(0),
    END_RANGE(9),
    INIT_POSITION(0);

    private String state;
    private int stateNumber;

    CarConstant(String state) {
        this.state = state;
    }

    CarConstant(int stateNumber) {
        this.stateNumber = stateNumber;
    }

    public int stateNumber() {
        return stateNumber;
    }

    public String message() {
        return state;
    }
}
