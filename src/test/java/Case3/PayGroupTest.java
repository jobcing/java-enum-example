package Case3;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ByeongChan on 2018. 3. 27..
 */
public class PayGroupTest {

    @Test
    public void PayTypeTest() throws Exception {
        String payCode = selectPayCode();
        PayGroup payGroup = PayGroup.findByPayCode(payCode);

        assertThat(payGroup.name(), is("CARD"));
        assertThat(payGroup.getTitle(), is("카드"));
    }


    private String selectPayCode(){
        return "KAKAO_PAY";
    }

    @Test
    public void AdvancedPayTypeTest () throws Exception {
        PayType payType = selectPayType();
        PayGroupAdvanced payGroupAdvanced = PayGroupAdvanced.findByPayType(payType);

        assertThat(payGroupAdvanced.name(), is("CARD"));
        assertThat(payGroupAdvanced.getTitle(), is("카드"));
    }



    private PayType selectPayType(){
        return PayType.BAEMIN_PAY;
    }
}
