package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Validator {

    public List<Car> validateCarName(String readCarName) {
        List<String> cars = List.of(readCarName.split(","));
        validateNameLength(cars);
        List<Car> convertCars = convertStringToCar(cars);
        return convertCars;
    }

    private List<Car> convertStringToCar(List<String> cars) {
        List<Car> convertCar = cars.stream().map(s -> new Car(s)).collect(Collectors.toList());
        return convertCar;
    }

    private void validateNameLength(List<String> cars) {
        if(cars.stream().filter(n -> n.length() > 5).count() > 0){
            throw new IllegalArgumentException("[ERROR] 자동차에 대한 이름의 길이는 5 이하여야 합니다.");
        }
    }

    public int validateInputTrial(String readTrial) {
        int trial=0;
        try{
            trial = Integer.parseInt(readTrial);
        }catch (Exception e){
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
        return trial;
    }


}
