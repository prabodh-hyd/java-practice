package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringbuilderTest {
    @Test
    public void testStringbuilder(){
        StringBuilderEx sb=new StringBuilderEx();
        String res=sb.reverseString();
        assertEquals("rama", res);
        int res1=sb.capacityString();
        assertEquals(29, res1);
    }
    
}
