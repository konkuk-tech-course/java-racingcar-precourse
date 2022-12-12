package racingcar.domain;


public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    public void move(int moving){
        this.position += moving;
    }

    public String getCarName(){
        return name;
    }
    public int getPosition(){
        return position;
    }
}
