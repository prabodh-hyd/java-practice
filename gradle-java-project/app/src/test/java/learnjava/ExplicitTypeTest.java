package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExplicitTypeTest {
    @Test
    public void testExplicitType(){
        ExplicitTypeCon ex=new ExplicitTypeCon();
        assertEquals(123, ex.convertDoubleToInt());
        assertEquals(456.78, ex.convertStringToDouble(),0.01);
    }
    
}
