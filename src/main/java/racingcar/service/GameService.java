package racingcar.service;

public class GameService {
    private static class InstanceHolder {
        private static final GameService INSTANCE = new GameService();
    }
    public static GameService getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
