package learnjava;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchExampleTest {
    @Test
    public void testSwitchCase(){
        SwitchExample se=new SwitchExample();
        assertEquals("Monday", se.getDayName(1));
        assertEquals("Friday", se.getDayName(5));
        
        // Test case for Sunday
        assertEquals("Sunday", se.getDayName(7));
        
        // Test case for invalid day of week
        try {
            se.getDayName(0);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid day of week: 0", e.getMessage());
        }
    }

    

    
    
}
