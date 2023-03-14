package learnjava;


import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class IfElseIfLadderTest {
    @Test
    public void testLadder(){
        IfElseIfLadderExample es=new IfElseIfLadderExample();
      
        String output = es.ladderMethod(80);
        String expected="Your grade is B.";
        assertEquals(expected, output);
        
        

        
    }
    
}
