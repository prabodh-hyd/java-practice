package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WhileLoopTest {
    @Test
    public void testWhileLoop(){
        int sum=0;
        int number =10;
        WhileLoopEx wl= new WhileLoopEx();
        int res=wl.exampleWhile(number, sum);
        assertEquals(55, res);


    }
    
}
