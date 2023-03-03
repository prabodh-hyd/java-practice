package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PackageTest {
    @Test
    public void testCalculator(){
        new Calculator();
        int i=5;
        int j=10;
        int res=Calculator.add(i,j);
        assertEquals(15, res);

    }
    
}
