package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NestedClassesTest {
    @Test
    public void testNestedClass(){
    Nestedclass ns=new Nestedclass();
    int res=ns.createInnerClassObject();
    assertEquals(100,res);
    
}
}
