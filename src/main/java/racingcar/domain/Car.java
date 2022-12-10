package racingcar.domain;

import racingcar.util.Moving;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    public void go(){
        this.position += Moving.GO.getValue();
    }
    public void stop(){
        this.position += Moving.STOP.getValue();
    }
}
