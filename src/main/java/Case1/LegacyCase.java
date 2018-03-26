package Case1;

/**
 * Created by ByeongChan on 2018. 3. 26..
 *
 * 출처 : http://woowabros.github.io/tools/2017/07/10/java-enum-uses.html
 */

public class LegacyCase {

    // origin value가 Y라면 1, N이라면 0 리턴
    public String table1Value(String originValue){
        if("Y".equals(originValue)){
            return "1";
        } else{
            return "0";
        }
    }

    // origin value가 Y라면 true, N이라면 false 리턴
    public boolean table2Value(String originValue){
        if("Y".equals(originValue)){
            return true;
        } else{
            return false;
        }
    }
}
