package learnjava;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class AbstractNonAccessModTest {
    @Test
    public void testAbstarctModifier(){
         AbstractNonAccessMod aws=new AbstractNonAccessMod();
         String res=aws.makeSound();
         assertEquals("Bow", res);
        
    }



    

    
    
}
