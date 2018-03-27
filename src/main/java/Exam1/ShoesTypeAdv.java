package Exam1;

/**
 * Created by ByeongChan on 2018. 3. 27..
 *
 * 열거형 상수를 다른 값과 연결하기. 여기선 문자열과 상수를 연결 --> 생성자 필요
 *
 * 출처 : https://opentutorials.org/module/1226/8025
 */
public enum ShoesTypeAdv {
    WALKING("워킹화"), RUNNING("런닝화"), TRACKING("트래킹화"), HIKING("등산화");

    private String name;

    // 생성자
    ShoesTypeAdv(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
