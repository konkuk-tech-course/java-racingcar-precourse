package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.Car;

public class Validator {

    public List<Car> validateCarName(String readCarName) {
        List<String> split = List.of(readCarName.split(","));
        if(split.stream().filter(n -> n.length() > 5).count() > 0){
            throw new IllegalArgumentException("[ERROR] 자동차에 대한 이름의 길이는 5 이하여야 합니다.");
        }
        List<Car> collect = split.stream().map(s -> new Car(s)).collect(Collectors.toList());

        return collect;
    }
}
