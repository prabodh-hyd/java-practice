package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuperKeyWordTest {
    @Test 
    public void testSuperkeyword(){
        SuperKeywordEx sk=new SuperKeywordEx();
        int res=sk.rr();
        assertEquals(10, res);
        


    }
    
}
