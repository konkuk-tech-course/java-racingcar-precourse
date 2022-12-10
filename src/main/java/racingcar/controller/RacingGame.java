package racingcar.controller;// @ author ninaaano

import racingcar.model.Car;
import racingcar.view.InputView;
import racingcar.view.OutputView;


public class RacingGame {

    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();


    public void start() {
        String[] names = inputView.inputCarName(); // 자동차 이름 입력 받기
        Car[] cars = new Car[names.length];
        int count = inputView.inputTryCount(); // 시도횟수 입력받기
        inputStart(names, cars);
        outputResult(count, cars);
        outputWinner(cars);
    }

    public void inputStart(String[] names, Car[] cars) {
        for (int i = 0; i < names.length; i++) {
            Car car = new Car(names[i]);
            cars[i] = car;
        }
    }

    // 결과 계산 해서 출력
    public void outputResult(int count, Car[] cars) {
        outputView.printResult();
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < cars.length; j++) {
                cars[j].moveCount();
                cars[j].carLocation();
            }
            System.out.println();
        }
    }

    // 승자 계산해서 출력
    public void outputWinner(Car[] cars) {
        String name = "";
        int max = -1;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPosition() == max) {
                name = name + ", " + cars[i].getName();
            }
            if (cars[i].getPosition() > max) {
                name = cars[i].getName();
                max = cars[i].getPosition();
            }
        }
        outputView.printWinner();
        System.out.print(name);
    }


}
