package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoWhileTest {
    @Test
    public void testDoWhile(){
        DoWhileLoopEx dw= new DoWhileLoopEx();
        int sum=dw.dowhileloop();
        assertEquals(15, sum);
    }

}
