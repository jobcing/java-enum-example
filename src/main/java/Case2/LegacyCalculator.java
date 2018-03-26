package Case2;

/**
 * Created by ByeongChan on 2018. 3. 26..
 */

public class LegacyCalculator {

    /*
    code인자를 따로 받아와 아래와 같은 별도의 메소드를 사용해야한다.
    code와 아래의 메소드가 서로 관계가 있다는 걸 표현할 수가 없다.
     */
    public static long calculate(String code, long originValue){

        if("CALC_A".equals(code)){
            return originValue;
        } else if("CALC_B".equals(code)){
            return originValue * 10;
        } else if("CALC_C".equals(code)){
            return originValue * 3;
        } else{
            return 0;
        }
    }
}
