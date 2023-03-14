package learnjava;


import java.lang.reflect.Method;

import org.junit.Test;

import junit.framework.TestCase;

public class ProtectedTest extends TestCase {
    @Test
    public void testSleep() throws Exception{
        ProtectedEXDog pt=new ProtectedEXDog("Dog");
        
         String res=pt.goSleep();
        assertEquals( "Dog is sleeping.", res);
        String res1=pt.bark();
        assertEquals("Dog is barking.", res1);
    }
    
}
