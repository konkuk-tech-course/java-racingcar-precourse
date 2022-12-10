package racingcar.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import racingcar.view.OutputView;

public class Game {

    private OutputView outputView;
    private List<Car> cars;
    private long trial;

    public Game(List<Car> cars, long trial, OutputView outputView) {
        this.cars = cars;
        this.trial = trial;
        this.outputView = outputView;
    }

    public void play() {
        outputView.printResultAnnounce();
        for (long moveCount = 0; moveCount < trial; moveCount++) {
            carMove();
            System.out.println();
        }
        Car maximumMovedCar = findMaxMovedCar();
        outputView.printWinningMember(findWinners(maximumMovedCar));
    }

    private List<String> findWinners(Car maximumMovedCar) {
        List<String> winningMembers = new ArrayList<>();
        for (int index = 0; index < cars.size(); index++) {
            if (cars.get(index).getPosition() == maximumMovedCar.getPosition()) {
                winningMembers.add(cars.get(index).getName());
            }
        }
        return winningMembers;
    }

    private Car findMaxMovedCar() {
        Comparator<Car> comparatorByTrace = Comparator.comparingInt(car -> car.getPosition());
        Car maximumMovedCar = cars.stream()
            .max(comparatorByTrace)
            .orElseThrow(IllegalArgumentException::new);
        return maximumMovedCar;
    }

    private void carMove() {
        for (int index = 0; index < cars.size(); index++) {
            cars.get(index).MoveOrStopAccordingToRandomNumber();
            cars.get(index).printUntilNowPosition(outputView);
        }
    }


}
