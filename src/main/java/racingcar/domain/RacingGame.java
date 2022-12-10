package racingcar.domain;

import racingcar.domain.converter.MovingConverter;
import racingcar.domain.converter.PositionConverter;
import racingcar.ui.InputView;
import racingcar.ui.OutputView;

public class RacingGame {
    private final InputView in ;
    private final OutputView out ;
    private final MovingConverter movingConverter;
    private final PositionConverter positionConverter;
    public RacingGame(){
        out = new OutputView();
        in = new InputView(out);
        movingConverter = new MovingConverter();
        positionConverter = new PositionConverter();
    }
    public void run(){
        int trial = in.getTrial();
        for(int i = 0; i < trial; i++){
            startRound();
        }
    }

    private void startRound(){

    }
}
