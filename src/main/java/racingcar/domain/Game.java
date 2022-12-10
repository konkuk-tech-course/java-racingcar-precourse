package racingcar.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import racingcar.Car;
import racingcar.view.OutputView;

public class Game {
    OutputView outputView;
    List<Car> cars;
    List<String> winningMember;
    int trial;
    public Game(List<Car> cars, int trial, OutputView outputView) {
        this.cars=cars;
        this.trial=trial;
        this.outputView = outputView;
        this.winningMember=new ArrayList<>();
    }

    public void play(){
        for(int i =0; i < trial; i++){
            carSetting();
        }
        Car carWithMax = findMaxCar();
        findWinners(carWithMax);
        outputView.printWinningMember(winningMember);
    }

    private void findWinners(Car carWithMax) {
        for(int index=0; index<cars.size(); index++){
            if(cars.get(index).getPosition() == carWithMax.getPosition()){
                winningMember.add(cars.get(index).getName());
            }
        }
    }

    private Car findMaxCar() {
        Comparator<Car> comparatorByTrace = Comparator.comparingInt(car -> car.getPosition());
        Car carWithMax = cars.stream()
            .max(comparatorByTrace)
            .orElseThrow(IllegalArgumentException::new);
        return carWithMax;
    }

    private void carSetting() {
        for(int index = 0; index<cars.size(); index++){
            cars.get(index).carSetting();
            cars.get(index).printPosition(outputView);
        }
        System.out.println();
    }


}
