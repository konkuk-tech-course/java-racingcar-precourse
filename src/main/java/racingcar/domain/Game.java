package racingcar.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import racingcar.view.OutputView;

public class Game {
    private OutputView outputView;
    private List<Car> cars;
    private List<String> winningMembers;
    private int trial;
    public Game(List<Car> cars, int trial, OutputView outputView) {
        this.cars=cars;
        this.trial=trial;
        this.outputView = outputView;
        this.winningMembers =new ArrayList<>();
    }

    public void play(){
        for(int moveCount =0; moveCount < trial; moveCount++){
            carMove();
        }
        Car carWithMax = findMaxCar();
        findWinners(carWithMax);
        outputView.printWinningMember(winningMembers);
    }

    private void findWinners(Car carWithMax) {
        for(int index=0; index<cars.size(); index++){
            if(cars.get(index).getPosition() == carWithMax.getPosition()){
                winningMembers.add(cars.get(index).getName());
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

    private void carMove() {
        for(int index = 0; index<cars.size(); index++){
            cars.get(index).MoveOrStopAccordingToRandomNumber();
            cars.get(index).printUntilNowPosition(outputView);
        }
        System.out.println();
    }


}
