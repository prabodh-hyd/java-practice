package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AutomaticTypeConTest {
    @Test
    public void testAutomaticTypeCon(){
        AutomaticTypeCon at=new AutomaticTypeCon();
        long res=at.intToLong();
        assertEquals(100L, res);
        

        
    }
    
}
