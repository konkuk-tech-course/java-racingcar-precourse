package racingcar.domain.converter;

public class PositionConverter {
    private static final String DISTANCE = "-";

    public String convertToDistance(int position){
        return DISTANCE.repeat(Math.max(0, position)) ;
    }

    public static void main(String[] args) {
        PositionConverter converter = new PositionConverter();
        System.out.println(converter.convertToDistance(3));
    }
}
