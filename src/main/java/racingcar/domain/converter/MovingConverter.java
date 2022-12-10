package racingcar.domain.converter;

public class MovingConverter {
    private static final int STANDARD = 4;

    public boolean isGo(int randomNumber){
        return randomNumber >= STANDARD ;
    }
}
