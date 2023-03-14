package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnonymousTest {
    @Test
    public void testAnonymous(){
        AnonymousInnerClass ai=new AnonymousInnerClass();
        int res=ai.getAge();
        assertEquals(21, res);




    }
    
}
