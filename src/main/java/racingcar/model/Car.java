package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현

    // 랜덤 넘버 생성
    private int pickNumberInRange() {
        return Randoms.pickNumberInRange(0,9);
    }

    // 랜덤 넘버를 받아서 position 증가 시킨다
    public void moveCount() {
        int count = pickNumberInRange();
        if (count >= 4) {
            position += 1;
        }
    }

    // 이름과 포지션 비교
    public void carLocation() {
        System.out.print(name + " : ");
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }


    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

}
