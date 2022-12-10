package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GameControllerTest {
    String errorMessage = "[ERROR]";
    GameController gameController = new GameController();
    @Test
    void 자동차이름_쉼표구분(){
        String testInput = "포비,티모,아무무,볼리베어";
        String[] result = {"포비", "티모", "아무무", "볼리베어"};
        String[] carNames = gameController.getCarNames(testInput);
        Assertions.assertThat(carNames).isEqualTo(result);
    }

    @Test
    void 이동횟수_숫자가아닌경우(){
        String notNumber = "123f";
        Assertions.assertThatThrownBy(()->gameController.validateTryNumber(notNumber)).
                isInstanceOf(IllegalArgumentException.class).
                hasMessageContaining(errorMessage);
    }

}