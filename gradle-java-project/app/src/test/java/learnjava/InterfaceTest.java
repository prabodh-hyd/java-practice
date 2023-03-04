package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InterfaceTest {
    @Test
    public void testInterface(){
        InterfaceEx ie=new InterfaceEx(11,10);
        double res=ie.getArea();
        double res1=ie.getPerimeter();
        assertEquals(110, res,0.001);
        assertEquals(42, res1,0.001);

        
    }
    
}
