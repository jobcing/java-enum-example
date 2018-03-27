package Case3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ByeongChan on 2018. 3. 27..
 */
public enum PayGroup {

    CASH("현금", Arrays.asList("ACCOUNT_TRANSFER", "REMITTANCE", "ON_SITE_PAYMENT")),
    CARD("카드", Arrays.asList("PAYCO", "CARD", "KAKAO_PAY")),
    ETC("기타", Arrays.asList("POINT", "COUPON")),
    EMPTY("없음", Collections.EMPTY_LIST);

    private String title;
    private List<String> payList;

    PayGroup(String title, List<String> payList){
        this.title = title;
        this.payList = payList;
    }

    public static PayGroup findByPayCode(String code){
        return Arrays.stream(PayGroup.values()) // PayGroup의 Enum 상수들을 순회하며
                .filter(payGroup -> payGroup.hasPayCode(code)) // PayCode를 갖고 있는게 있는지 확인합니다.
                .findAny()
                .orElse(EMPTY);
    }

    public boolean hasPayCode(String code){
        return payList.stream()
                .anyMatch(pay -> pay.equals(code));
    }

    public String getTitle(){ return title; }
}
