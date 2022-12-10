package racingcar.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
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

        Comparator<Car> comparatorByTrace = Comparator.comparingInt(car -> car.getPosition());
        Car carWithMax = cars.stream()
            .max(comparatorByTrace)
            .orElseThrow(NoSuchElementException::new);

        for(int i=0; i<cars.size(); i++){
            if(cars.get(i).getPosition() == carWithMax.getPosition()){
                winningMember.add(cars.get(i).getName());
            }
        }
        outputView.printWinningMember(winningMember);
    }

    private void carSetting() {
        for(int j = 0; j<cars.size(); j++){
            cars.get(j).carSetting();
            cars.get(j).printPosition(outputView);
        }
        System.out.println();
    }



}
