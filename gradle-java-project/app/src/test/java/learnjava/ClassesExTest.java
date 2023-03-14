package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClassesExTest {
    @Test
    public void testClass(){
     ClassesEx cs= new ClassesEx();
     boolean res=cs.turnOn();
     assertEquals(true, res);
     boolean res1=cs.turnOff();
     assertEquals(false, res1);
    }
    
}
