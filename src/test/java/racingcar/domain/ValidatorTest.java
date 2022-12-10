package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

public class ValidatorTest {

    Validator validator = new Validator();
    private static final String ERROR_MESSAGE = "[ERROR]";

    @ParameterizedTest
    @DisplayName("초기 자동차 입력값 , 구분자에 따라 분류하는지 확인")
    @ValueSource(strings = {"pobi,woni,jun", "wowm,qwer,asdf"})
    void separateCarName(String readCarName) {
        List<Car> cars = validator.validateCarName(readCarName);
        Assertions.assertThat(cars.size()).isEqualTo(3);
    }


    @ParameterizedTest
    @DisplayName("자동차의 이름의 길이가 5가 넘는 경우들")
    @ValueSource(strings = {"pobiㄷㅈㄱ,woni,jun", "wowm,qwer123,asdf"})
    void carNameLength(String readCarName) {
       Assertions.assertThatThrownBy(()->{
           validator.validateCarName(readCarName);
       }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @DisplayName("시도 횟수 입력시 올바른 값이 아닌 경우")
    @ValueSource(strings = {"dsf", "ㅂㅈㄷㄱ"})
    void inputTrial(String readTrial) {
        Assertions.assertThatThrownBy(()->{
            validator.validateInputTrial(readTrial);
        }).isInstanceOf(IllegalArgumentException.class);
    }





}
