package racingcar.domain.converter;

public class PositionConverter {
    private static final String DISTANCE = "-";

    public String converToDistance(int position){
        return DISTANCE.repeat(Math.max(0, position)) ;
    }
}
