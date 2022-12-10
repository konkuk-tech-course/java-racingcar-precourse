package racingcar.domain.constant;

public enum CarConstant {


    MOVE("-"),

    INIT_TRACE(""),
    CAPABLE_MOVE_NUMBER(4),
    START_RANGE(0),
    END_RANGE(9);


    private String state;
    private int stateNumber;

    CarConstant(String state) {
        this.state = state;
    }

    CarConstant(int stateNumber) {
        this.stateNumber = stateNumber;
    }

    public int getStateNumber() {
        return stateNumber;
    }

    public String getState() {
        return state;
    }
}
