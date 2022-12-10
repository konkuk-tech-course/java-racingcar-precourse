package racingcar.view;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ViewValidatorTest {
    @DisplayName("이름 검증시 비어있는 값이면 IllegalArgumentException를 발생시킨다.")
    @Test
    void Empty_Value_Test() {
        assertThatThrownBy(() -> ViewValidator.validateName(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]")
                .hasMessageContaining("빈 값");
    }

    @DisplayName("이름의 길이가 5자 이상이면 IllegalArgumentException를 발생시킨다.")
    @Test
    void Invalid_Length_Name_Test() {
        assertThatThrownBy(() -> ViewValidator.validateName("dfesde"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]")
                .hasMessageContaining("5자 이하");
    }

    @DisplayName("시도 횟수 검증시 비어있는 값이면 IllegalArgumentException를 발생시킨다.")
    @Test
    void Empty_Value_Of_TryCount_Test() {
        assertThatThrownBy(() -> ViewValidator.validateTryCount(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]")
                .hasMessageContaining("빈 값");
    }

    @DisplayName("시도 횟수에 숫자가 아닌 값이 들어오면 IllegalArgumentException를 발생시킨다.")
    @Test
    void Invalid_Value_For_TryCount_Test() {
        assertThatThrownBy(() -> ViewValidator.validateTryCount("df2e"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]")
                .hasMessageContaining("숫자만");
    }
}
