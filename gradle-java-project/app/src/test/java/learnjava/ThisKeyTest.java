package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThisKeyTest {
    @Test
    public void testThisKey(){
        ThisKeywordExa th=new ThisKeywordExa();
        int res=th.gfg();
        assertEquals(100, res);
    }
    
}
