package Case1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ByeongChan on 2018. 3. 26..
 */
public class TableStatusTest {

    private TableStatus getOriginValue(){
        return TableStatus.Y;
    }

    @Test
    public void originValueChange() throws Exception{
        TableStatus origin = getOriginValue();

        String table1Value = origin.getTable1Value();
        boolean table2Value = origin.isTable2Value();

        assertThat(origin, is(TableStatus.Y));
        assertThat(table1Value, is("1"));
        assertThat(table2Value, is(true));
    }
}
