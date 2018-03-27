package Case3;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ByeongChan on 2018. 3. 27..
 */
public class PayGroupTest {

    @Test
    public void PayTypeAnswer() throws Exception {
        String payCode = selectPayCode();
        PayGroup payGroup = PayGroup.findByPayCode(payCode);

        assertThat(payGroup.name(), is("KAKAO_PAY"));
        assertThat(payGroup.getTitle(), is("카카오페이"));
    }


    private String selectPayCode(){
        return "KAKAO_PAY";
    }

}
