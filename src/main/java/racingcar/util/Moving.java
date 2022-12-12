package racingcar.util;

public enum Moving {
    GO(1),
    STOP(0);

    private final int moveValue;

    Moving(int moveValue){
        this.moveValue = moveValue;
    }
    public int getValue(){
        return this.moveValue;
    }
}
