package Case1;

/**
 * Created by ByeongChan on 2018. 3. 26..
 *
 * 출차 : http://woowabros.github.io/tools/2017/07/10/java-enum-uses.html
 */

public enum TableStatus {

    // Y == 1 == true
    Y("1", true),
    N("0", false);

    private String table1Value;
    private boolean table2Value;

    TableStatus(String table1Value, boolean table2Value){
        this.table1Value = table1Value;
        this.table2Value = table2Value;
    }

    public String getTable1Value(){ return table1Value; }
    public boolean isTable2Value(){ return table2Value; }
}
