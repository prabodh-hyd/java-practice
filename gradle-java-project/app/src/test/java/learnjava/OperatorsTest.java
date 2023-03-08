package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OperatorsTest {
    @Test
    public void testOperators(){
        OperatorsEx oe=new OperatorsEx();
        assertEquals(30, oe.sum());
        assertEquals(-10, oe.sub());
        assertEquals(200, oe.multiply());
        assertEquals(2, oe.division());
        assertEquals(0, oe.modulodivision());
        assertEquals(false, oe.isEqual());
        assertEquals(true, oe.notEqual());
        assertEquals(false, oe.greater());
        assertEquals(true, oe.lessthan());
        assertEquals(false, oe.greaterThanOrEqual());
        assertEquals(true, oe.lessThanOrEqual());

    }
    
}
