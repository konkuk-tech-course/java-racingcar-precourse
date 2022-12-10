package racingcar;

import racingcar.controller.RacingController;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    // 중요한 건 꺾이지 않는 마음
    // 중요한 건 꺾이지 않는 마음
    public static void main(String[] args) {
        // TODO 구현 진행
        RacingController racingController = new RacingController(new InputView(), new OutputView());
        racingController.activate();
    }
}
