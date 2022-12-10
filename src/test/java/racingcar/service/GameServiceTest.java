package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import racingcar.domain.Game;

import java.util.List;
import java.util.Map;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;
import static org.assertj.core.api.Assertions.assertThat;

public class GameServiceTest {
    static MockedStatic<Randoms> mock;
    static GameService gameService = GameService.getInstance();
    static Game game;

    @BeforeEach
    void beforeEach() {
        mock = mockStatic(Randoms.class);
        mock.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                .thenReturn(3, 4, 1, 2);
        List<String> names = List.of("pobi", "jun");
        game = gameService.createGame(names, 4);
        gameService.playRound(game);
        gameService.playRound(game);
    }

    @DisplayName("랜덤값이 4이상일 때만 움직인다.")
    @Test
    void playRoundTest() {
        Map<String, Integer> results = Map.of(
                "pobi", 0,
                "jun", 1
        );
        assertThat(game.createGameStatus()).isEqualTo(results);
    }
}
