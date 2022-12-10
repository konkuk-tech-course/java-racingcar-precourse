package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.constant.ExceptionMessage;

public class Validator {

    private final String DELIMETER = ",";
    private final int NAME_LENGTH_MAX = 5;

    public List<Car> validateCarName(String readCarName) {
        List<String> cars = List.of(readCarName.split(DELIMETER));
        validateNameLength(cars);
        List<Car> convertCars = convertStringToCar(cars);
        return convertCars;
    }

    private List<Car> convertStringToCar(List<String> cars) {
        List<Car> convertCar = cars.stream().map(carName -> new Car(carName))
            .collect(Collectors.toList());
        return convertCar;
    }

    private void validateNameLength(List<String> cars) {
        if (cars.stream().filter(n -> n.length() > NAME_LENGTH_MAX).count() > 0) {
            throw new IllegalArgumentException(ExceptionMessage.ERROR_NAME_LENGTH.message());
        }
    }

    public long validateInputTrial(String readTrial) {
        int trial = 0;
        try {
            trial = Integer.parseInt(readTrial);
        } catch (Exception e) {
            throw new IllegalArgumentException(ExceptionMessage.ERROR_INPUT_TRIAL.message());
        }
        return trial;
    }


}
