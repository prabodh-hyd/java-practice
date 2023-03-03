package learnjava;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ForLoopExampleTest {
    @Test
    public void testForLoop()
          {
         ForLoopExample fr=new ForLoopExample();
         assertEquals(55, fr.findSum());
        }
    
    
}
