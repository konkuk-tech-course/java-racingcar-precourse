package racingcar.view;// @ author ninaaano

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.constant.ViewMessage;

/**
 * - [] 경주할 자동차 이름을 입력 받는다
 * - [] 이름은 쉼표 기준으로 구분한다
 * - [] 시도할 횟수를 입력 받는다
 */
public class InputView {


    public String[] inputCarName(){
        System.out.println(ViewMessage.INPUT_GAME_START_MESSAGE.getMessage());
        String input = Console.readLine();
        String carName[] = input.split(",");
        for(int i=0; i<carName.length; i++){
            String name = carName[i];
            carName[i] = name.trim();
        }
        //Validator.validateInputName(input);
        return carName;
    }

    public int inputTryCount(){
        System.out.println(ViewMessage.INPUT_USER_TRY_COUNT.getMessage());
        int count = Integer.parseInt(Console.readLine());
        Validator.validateInputTryNumber(count);
        return count;
    }
}
