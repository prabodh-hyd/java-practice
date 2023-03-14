package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContinueTest {
    @Test
    public void testContinue(){
        ContinueEx ce=new ContinueEx();
         int res=ce.continueM();
         assertEquals(9, res);
         

    }
    
}
