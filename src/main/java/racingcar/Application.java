package racingcar;

import racingcar.controller.RacingGame;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        try {
            RacingGame racingGame = new RacingGame();
            racingGame.start();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
