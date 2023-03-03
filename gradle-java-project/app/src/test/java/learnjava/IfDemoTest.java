package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public  class IfDemoTest {
    @Test
    public void testIf(){
        ExDemo id=new ExDemo();
        String res=id.testIfDemo();
        assertEquals("true", res);

    }
    
}
