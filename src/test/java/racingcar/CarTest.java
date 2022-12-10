package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



class CarTest {
    String testName = "테스트이름";
    Car car = new Car(testName);

    @Test
    void 랜덤숫자생성_테스트() {

        final int startRange = 0;
        final int endRange = 9;

        int randomNumber = car.getRandomNumber();
        Assertions.assertThat(randomNumber).isBetween(startRange,endRange);
    }

    @Test
    void 전진하지않는경우_테스트(){
        final int startRange = 0;
        final int notProcessEndRange = 4;
        final int ZERO = 0;
        for(int notProcessNumber = startRange; notProcessNumber < notProcessEndRange; notProcessNumber++){
            car.processStart(notProcessNumber);
        }
        Assertions.assertThat(car.getPosition()).isEqualTo(ZERO);
    }

    @Test
    void 전진하는경우_테스트(){
        final int startRange = 4;
        final int endRange = 9;
        final int expectedResult = endRange - startRange + 1;
        for(int processNumber = startRange; processNumber <= endRange; processNumber++){
            car.processStart(processNumber);
        }
        Assertions.assertThat(car.getPosition()).isEqualTo(expectedResult);
    }
}