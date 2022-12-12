package racingcar.domain.converter;

import racingcar.util.Moving;

public class MovingConverter {
    private static final int STANDARD = 4;

    public int convertToMove(int randomNumber){
        if (randomNumber >= STANDARD){
            return Moving.GO.getValue();
        }
        return Moving.STOP.getValue() ;
    }

    public static void main(String[] args) {
        MovingConverter converter = new MovingConverter();
        System.out.println(converter.convertToMove(3));
    }
}
