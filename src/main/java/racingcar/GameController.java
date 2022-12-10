package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GameController {
    private final int limitNameLength = 5;
    private final String errorNameLengthMessage = "[ERROR] 이름은 5자 이하만 가능합니다.";
    private final String errorTryNumberNegativeMessage = "[ERROR] 시도 횟수는 양수이어야 한다.";
    private final String errorTryNumberFormatMessage = "[ERROR] 시도 횟수는 숫자여야 한다.";
    private final int ZERO = 0;
    public void start(){
        View.printInputMessage();
        List<Car> cars = inputCarNames();
        View.printAskTryNum();
        int tryNumber = inputTryNumber();
        List<Car> gameResult = runGames(cars, tryNumber);
        List<Car> winner = getWinner(gameResult);
        View.printWinner(winner);
    }

    public List<Car> inputCarNames(){
        String inputString = Console.readLine();
        String[] carNames = getCarNames(inputString);
        List<Car> cars = new ArrayList<>();
        for(String carName : carNames){
            cars.add(new Car(carName));
        }
        return cars;
    }

    public void validateCarNamesLength(String[] carNames){
        for(String carName : carNames){
            if(carName.length() > limitNameLength){
                throw new IllegalArgumentException(errorNameLengthMessage);
            }
        }
    }

    public String[] getCarNames(String cars){
        String[] carNames = cars.split(",");
        validateCarNamesLength(carNames);
        return carNames;
    }

    public int inputTryNumber() {
        String stringNumber = Console.readLine();
        validateTryNumber(stringNumber);
        int tryNumber = Integer.parseInt(stringNumber);
        return tryNumber;
    }

    public void validateTryNumber(String stringNumber){
        try{
            int tryNumber = Integer.parseInt(stringNumber);
            if (isNegativeNumber(tryNumber)) {
                throw new IllegalArgumentException(errorTryNumberNegativeMessage);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(errorTryNumberFormatMessage);
        }
    }

    public List<Car> runGames(List<Car> cars, int tryNumber){
        View.printResultMessage();
        for(int i = 0; i < tryNumber; i++){
            cars = runGame(cars);
            View.printGameResult(cars);
        }
        return cars;
    }

    public List<Car> runGame(List<Car> cars){
        for(Car car : cars){
            car.start();
        }
        return cars;
    }

    public List<Car> getWinner(List<Car> result){
        int maxPosition = getMaxPosition(result);
        List<Car> winner = result.stream().filter(c -> c.getPosition() == maxPosition).collect(Collectors.toList());
        return winner;
    }

    public int getMaxPosition(List<Car> result){
        List<Integer> positions = result.stream().map(c -> c.getPosition()).collect(Collectors.toList());
        return positions.stream().max(Integer::compare).orElse(ZERO);
    }

    public boolean isNegativeNumber(int number){
        if(number < ZERO){
            return true;
        }
        return false;
    }
}
