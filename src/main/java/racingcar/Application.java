package racingcar;

import racingcar.controller.RacingController;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        RacingController racingController = new RacingController(new InputView(), new OutputView());
        racingController.run();
    }
}
