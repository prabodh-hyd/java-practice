package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringMethodsTest {
    @Test
    public void testStringMethods(){
        StringMethodsEx sm=new StringMethodsEx();
        assertEquals(13, sm.lengthOfString());
        assertEquals('k', sm.charOfString());
        assertEquals("ks", sm.subString());
        assertEquals("GeeksforGeeks", sm.concatenate());
        assertEquals(6, sm.indexOfString());
        assertEquals(false, sm.equla());
        assertEquals(-1, sm.compare());
        assertEquals("geekyme", sm.lowercase());
        assertEquals("GEEKYME", sm.uppercase());
        assertEquals("Hello, world!",sm.trim());
        assertEquals("geeksgorgeeks", sm.replace());

    }
    
}
