package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConstructorTest {
    @Test
    public void testConstructor(){
        ConstructorEx ce=new ConstructorEx();
        assertEquals("", ce.getName());
        assertEquals(0, ce.getAge());
    }
    @Test
    public void test2(){
        ConstructorEx ce=new ConstructorEx("John",30);
        assertEquals("John", ce.getName());
        assertEquals(30, ce.getAge());


    }
    
}
