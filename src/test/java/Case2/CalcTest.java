package Case2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ByeongChan on 2018. 3. 26..
 */
public class CalcTest {

    private String selectCode(){
        return "CALC_B";
    }

    private CalculatorType selectType(){
        return CalculatorType.CALC_B;
    }


    @Test
    public void LegacyCalcTest() throws Exception{
        String code = selectCode();
        long originValue = 10000L;

        long result = LegacyCalculator.calculate(code, originValue);

        assertThat(result, is(100000L));
    }

    @Test
    public void EnumApplyCalcTest() throws Exception{
        CalculatorType code = selectType();
        long originValue = 10000L;

        long result = code.calculate(originValue);

        assertThat(result, is(100000L));
    }
}
