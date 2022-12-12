package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.converter.MovingConverter;
import racingcar.domain.converter.PositionConverter;
import racingcar.ui.InputView;
import racingcar.ui.OutputView;
import racingcar.util.Command;
import racingcar.util.comparator.CarComparator;
import racingcar.util.generator.MovingRandomNumberGenerator;

public class RacingGame {
    private final InputView in ;
    private final OutputView out ;
    private final MovingConverter movingConverter;
    private final PositionConverter positionConverter;
    private final MovingRandomNumberGenerator movingGenerator;

    private final List<Car> racingBoard;

    public RacingGame(){
        out = new OutputView();
        in = new InputView(out);
        movingConverter = new MovingConverter();
        positionConverter = new PositionConverter();
        movingGenerator = new MovingRandomNumberGenerator();
        racingBoard = new ArrayList<>();
    }
    public void run(){
        registerCar();

        startGame();
        rankBoard();

        showWinner();
    }
    private void registerCar(){
        List<String> racingCars = in.getCarNames();
        for(String car : racingCars){
            racingBoard.add(new Car(car));
        }
    }

    private void startGame(){
        int trial = in.getTrial();
        out.printMessage(Command.EXECUTE_MESSAGE.getMessage());
        for(int i = 0; i < trial; i++){
            startRound();
            showBoard();
        }
    }
    private void startRound(){
//        for(int carNumber = 0; carNumber < racingBoard.size() ; carNumber++){
//            int moving = selectMoving();
//            Car nowCar = racingBoard.get(carNumber);
//            nowCar.move(moving);
//            racingBoard.set(carNumber, nowCar);
//        }
        for(Car car : racingBoard){
            int moving = selectMoving();
            car.move(moving);
        }
    }
    private int selectMoving(){
        int randomNumber = movingGenerator.generate();
        return movingConverter.convertToMove(randomNumber);
    }
    private void showBoard(){
        for(Car car : racingBoard){
            String movingDistance = positionConverter.convertToDistance(car.getPosition());
            out.printCarPosition(car.getCarName(), movingDistance);
        }
        out.printMessage(Command.EMPTY_LINE.getMessage());
    }
    private void rankBoard(){
        racingBoard.sort(new CarComparator());
    }
    private void showWinner(){
        int highestDistance = racingBoard.get(0).getPosition();
        List<String> winners = racingBoard.stream()
                .filter(car -> car.getPosition() == highestDistance)
                .map(Car::getCarName)
                .collect(Collectors.toList());
        out.printGameWinner(winners);
    }

    public static void main(String[] args) {
        RacingGame game = new RacingGame();
        game.registerCar();
    }
}
