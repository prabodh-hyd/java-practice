package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NonAccessModTest {
    @Test
    public void testStaticModifier(){
        NonAccessModEx na=new NonAccessModEx();
        int res=na.myMethod();
        assertEquals(1, res);
    }
    
}
