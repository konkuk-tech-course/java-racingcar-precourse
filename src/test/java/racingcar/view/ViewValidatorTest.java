package racingcar.view;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class ViewValidatorTest {
    @Test
    void Empty_Value_Test() {
        assertThatThrownBy(() -> ViewValidator.validateName(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]")
                .hasMessageContaining("빈 값");
    }

    @Test
    void Invalid_Length_Name_Test() {
        assertThatThrownBy(() -> ViewValidator.validateName("dfesde"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]")
                .hasMessageContaining("5자 이하");
    }
}
