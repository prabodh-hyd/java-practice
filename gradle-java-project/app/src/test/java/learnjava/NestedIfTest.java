package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NestedIfTest {
    @Test
    public void testnestedif(){
        NestedIfExample ni=new NestedIfExample();
        String res=ni.nestedif(18, 160);
        assertEquals("You are eligible to ride the roller coaster.", res);
        String res1=ni.nestedif(11,100);
        assertEquals("You are not old enough to ride the roller coaster.", res1);
        String res2=ni.nestedif(19,130);
        assertEquals("You are not tall enough to ride the roller coaster.", res2);

    }
    
}
