package learnjava;


import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class IfElseIfLadderTest {
    @Test
    public void testLadder(){
        IfElseIfLadderExample es=new IfElseIfLadderExample();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        es.ladderMethod(80);
        String output = baos.toString();
        String expected="Your grade is B.\n";
        assertEquals(expected, output);
        
        

        
    }
    
}
