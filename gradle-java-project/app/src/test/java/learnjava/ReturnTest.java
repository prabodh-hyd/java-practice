package learnjava;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnTest {
    @Test
    public void testisTrue(){
        ReturnExample re=new ReturnExample();
        assertTrue(re.isEvenNumber(2));
        assertFalse(re.isEvenNumber(3));
    }
}
