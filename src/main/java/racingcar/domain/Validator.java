package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.Car;

public class Validator {

    public String validateCarName(String readCarName) {
        List<String> split = List.of(readCarName.split(","));

        List<Car> collect = split.stream().map(s -> new Car(s)).collect(Collectors.toList());


    }
}
