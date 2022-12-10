package racingcar;

import java.util.*;

public class View {
    public static final String inputMessage = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)";
    public static final String askTryNum = "시도할 회수는 몇회인가요?";
    public static final String resultMessage = "실행 결과";
    public static final String track = "-";
    public static final String finalWinner = "최종 우승자 : ";

    public static void printInputMessage(){
        System.out.println(inputMessage);
    }

    public static void printAskTryNum(){
        System.out.println(askTryNum);
    }

    public static void printGameResult(List<Car> cars){
        for(Car car : cars){
            System.out.println(car.getName() + " : " + getTrack(car));
        }
        System.out.println();
    }
    public static String getTrack(Car car){
        int number = car.getPosition();
        String trackResult = "";
        for(int i = 0; i < number; i++){
            trackResult += track;
        }
        return trackResult;
    }

    public static void printWinner(List<Car> winner){
        String resultString = getResultString(winner);
        System.out.println(resultString);
    }

    public static String getResultString(List<Car> winner){
        String result = finalWinner;
        for(Car car : winner){
            result += car.getName();
            result += ", ";
        }
        result = result.substring(0, result.length() - 2);
        return result;
    }

    public static void printResultMessage(){
        System.out.println(resultMessage);
    }
}
