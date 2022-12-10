package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ViewTest {

    @Test
    void 우승자_여러명_출력() {
        List<Car> winner = new ArrayList<>();
        winner.add(new Car("사람1"));
        winner.add(new Car("사람2"));
        winner.add(new Car("사람3"));
        String result = "최종 우승자 : 사람1, 사람2, 사람3";

        Assertions.assertThat(View.getResultString(winner)).isEqualTo(result);
    }
}