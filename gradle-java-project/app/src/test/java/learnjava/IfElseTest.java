package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IfElseTest {
    @Test
    public void testIfElse(){
        IfElseExample is=new IfElseExample();
        boolean res=is.methodIfElse();
        assertEquals(true,res);
    }
    
}
