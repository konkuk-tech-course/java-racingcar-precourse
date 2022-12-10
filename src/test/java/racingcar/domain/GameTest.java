package racingcar.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameTest {

    List<String> inputCars = new ArrayList<>();
    List<Car> cars = new ArrayList<>();
    Car carWithMax;

    @BeforeEach
    void initCars(){
        inputCars = List.of("woni", "pobi", "jun");
        cars = inputCars.stream().map(s -> new Car(s)).collect(Collectors.toList());
        for(int i=0; i<4; i++){
            for(int j=0; j<cars.size(); j++){
                cars.get(j).carMovingProcess();
            }
        }
        setCarWithMax();
    }

    private void setCarWithMax() {
        Comparator<Car> comparatorByTrace = Comparator.comparingInt(car -> car.getPosition());
        carWithMax = cars.stream()
            .max(comparatorByTrace)
            .orElseThrow(IllegalArgumentException::new);
    }



    @Test
    @DisplayName("공동 우승자에 대하여 찾을 수 있는지 테스트")
    void findWinners(){
        List<String> winningMembers = new ArrayList<>();
        for(int index=0; index<cars.size(); index++){
            if(cars.get(index).getPosition() == carWithMax.getPosition()){
                winningMembers.add(cars.get(index).getName());
            }
        }
        Assertions.assertThat(winningMembers.size()).isGreaterThan(0);
    }




}
