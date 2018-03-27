package Case3;

/**
 * Created by ByeongChan on 2018. 3. 27..
 * <p>
 * 출처 : http://woowabros.github.io/tools/2017/07/10/java-enum-uses.html
 */

public class LegacyPayGroup {

    public static String getPayGroup(String payCode) {

        if ("ACCOUNT_TRANSFER".equals(payCode) || "REMITTANCE".equals(payCode) || "ON_SITE_PAYMENT".equals(payCode)) {
            return "CASH";
        } else if ("PAYCO".equals(payCode) || "CARD".equals(payCode) || "KAKAO_PAY".equals(payCode)) {
            return "CARD";
        } else if ("POINT".equals(payCode) || "COUPON".equals(payCode)) {
            return "ETC";
        } else {
            return "EMPTY";
        }
    }

    /* 문제점

    둘의 관계를 파악하기가 어렵습니다.
        - 위 메소드는 포함관계를 나타내는 것일까요? 아니면 단순한 대체값을 리턴한것일까요?
        - 현재는 결제종류가 결제수단을 포함하고 있는 관계인데, 메소드만으로 표현이 불가능합니다.
    입력값과 결과값이 예측 불가능합니다.
        - 결제 수단의 범위를 지정할수 없어서 문자열이면 전부 파라미터로 전달 될 수 있습니다.
        - 마찬가지로 결과를 받는 쪽에서도 문자열을 받기 때문에 결제종류로 지정된 값만 받을 수 있도록 검증코드가 필요하게 됩니다.
    그룹별 기능을 추가하기가 어렵습니다.
        - 결제 종류에 따라 추가 기능이 필요할 경우 현재 상태라면 어떻게 구현 할수 있을까요?
        - 또다시 결제종류에 따른 if문으로 메소드를 실행하는 코드를 작성해야 할까요?

     */
}
