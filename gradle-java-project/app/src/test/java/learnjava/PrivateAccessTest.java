package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrivateAccessTest {
    @Test
    public void testPrivateAccess(){
        PrivateAccessEx pa=new PrivateAccessEx();
        pa.setName("Sitha");
        String res=pa.getName();
        
        assertEquals("Sitha", res);
    
        

    }

   

    
}
