package racingcar;

import camp.nextstep.edu.missionutils.Randoms;


public class Car {
    private static final int startNumber = 0;
    private static final int endNumber = 9;
    private static final int limitNumber = 4;
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }
    // 추가 기능 구현

    public void start(){
        int randomNumber = getRandomNumber();
        processStart(randomNumber);
    }

    public int getRandomNumber(){
        return Randoms.pickNumberInRange(startNumber, endNumber);
    }

    public void processStart(int number){
        if(number >= limitNumber){
            position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
