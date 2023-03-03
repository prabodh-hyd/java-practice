package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayTest {
    @Test 
    public void testArray(){
        Arrayex ae=new Arrayex();
        int[] numbers1 = {1, 2, 3, 4, 5};
        int expectedAverage =  3;
        int actualAverage =  ae.calculateAverage(numbers1);
        assertEquals(expectedAverage, actualAverage);
        


        
    }
    
}
