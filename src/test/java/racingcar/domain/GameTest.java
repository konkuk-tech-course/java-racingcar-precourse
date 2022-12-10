package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
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
        Map<String, Boolean> moves = Map.of(
                "abc", true,
                "bcd", false,
                "cde", true
        );
        game.controlCars(moves);
    }

    @Test
    void controlCarsTest() {
        Map<String, Integer> gameStatus = game.createGameStatus();
        assertThat(gameStatus).isEqualTo(Map.of(
                "abc", 1,
                "bcd", 0,
                "cde", 1
        ));
    }

    @Test
    void findLeadingCarsTest() {
        List<String> leadingCars = List.of("abc", "cde");
        assertThat(game.findLeadingCars()).isEqualTo(leadingCars);
    }

    @Test
    void hasRemainingMovesTest() {
        assertThat(game.hasRemainingMoves()).isTrue();
    }

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
