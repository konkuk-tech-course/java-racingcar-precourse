package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.Car;

public class Validator {

    public String validateCarName(String readCarName) {
        List<String> split = List.of(readCarName.split(","));
        if(readCarName.chars().filter(n -> n==',').count() != split.size()-1){
            throw new IllegalArgumentException("[ERROR] 구분자로는 , 가 와야 합니다.");
        }
        List<Car> collect = split.stream().map(s -> new Car(s)).collect(Collectors.toList());


    }
}
