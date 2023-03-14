package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InnerClassesTest {
    @Test
    public void testInnerClass(){
        InnerClassesEx in=new InnerClassesEx();
        assertEquals(10, InnerClassesEx.StaticInnerClass.printVariables());
        InnerClassesEx.StaticInnerClass.createInnerClass();
        assertEquals(11, InnerClassesEx.StaticInnerClass.printVariables());
    }

    
}
