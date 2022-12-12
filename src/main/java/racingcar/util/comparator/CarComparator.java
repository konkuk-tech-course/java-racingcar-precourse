package racingcar.util.comparator;

import java.util.Comparator;
import racingcar.domain.Car;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return -(car1.getPosition() - car2.getPosition());
    }
}
