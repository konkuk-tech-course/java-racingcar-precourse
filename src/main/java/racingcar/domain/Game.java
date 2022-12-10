package racingcar.domain;

import java.util.List;
import racingcar.Car;
import racingcar.view.OutputView;

public class Game {

    OutputView outputView;
    List<Car> cars;
    int trial;
    public Game(List<Car> cars, int trial, OutputView outputView) {
        this.cars=cars;
        this.trial=trial;
        this.outputView = outputView;
    }

    public void play(){
        for(int i =0; i < trial; i++){
            for(int j = 0; j<cars.size(); j++){
                cars.get(j).carSetting();
                cars.get(j).printPosition(outputView);
            }
            System.out.println();
        }

    }
}
