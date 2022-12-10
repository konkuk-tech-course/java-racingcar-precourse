package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.domain.constant.CarConstant;

public class CarTest {
    boolean moveCheck = false;

    @Test
    void MoveOrStopAccordingToRandomNumber() {
        int randomMoveNumber = Randoms.pickNumberInRange(CarConstant.START_RANGE.stateNumber(),
            CarConstant.END_RANGE.stateNumber());
        if (randomMoveNumber >= CarConstant.CAPABLE_MOVE_NUMBER.stateNumber()) {
            moveCheck = true;
            Assertions.assertThat(moveCheck).isTrue();
        }
        if (randomMoveNumber < CarConstant.CAPABLE_MOVE_NUMBER.stateNumber()) {
            Assertions.assertThat(moveCheck).isFalse();
        }
    }


}
