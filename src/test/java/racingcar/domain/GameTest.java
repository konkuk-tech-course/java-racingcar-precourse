package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {
    static Game game;

    @BeforeEach
    void beforeEach() {
        game = new Game(3);
        game.addCar(new Car("abc"));
        game.addCar(new Car("bcd"));
        game.addCar(new Car("cde"));
        Map<String, Boolean> moveConditions = Map.of(
                "abc", true,
                "bcd", false,
                "cde", true
        );
        game.controlCars(moveConditions);
    }

    @DisplayName("각 자동차별로 true값이 주어지면 움직이고 false면 움직이지 않는다.")
    @Test
    void controlCarsTest() {
        Map<String, Integer> gameStatus = game.createGameStatus();
        assertThat(gameStatus).isEqualTo(Map.of(
                "abc", 1,
                "bcd", 0,
                "cde", 1
        ));
    }

    @DisplayName("가장 선두로 가고 있는 자동차들을 반환한다.")
    @Test
    void findLeadingCarsTest() {
        List<String> leadingCars = List.of("abc", "cde");
        assertThat(game.findLeadingCars()).isEqualTo(leadingCars);
    }

    @DisplayName("시도 횟수가 남아있을 때 hasRemainingMoves는 true를 반환한다.")
    @Test
    void hasRemainingMovesTest() {
        assertThat(game.hasRemainingMoves()).isTrue();
    }

    @DisplayName("시도 횟수가 없을 때 hasRemainingMoves는 false를 반환한다.")
    @Test
    void hasRemainingMovesTest_When_False() {
        Map<String, Boolean> moves = Map.of(
                "abc", true,
                "bcd", false,
                "cde", true
        );
        game.controlCars(moves);
        game.controlCars(moves);
        assertThat(game.hasRemainingMoves()).isFalse();
    }
}
