package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NonAccessModifierFinalTest {
    @Test
    public void testFinal(){
        NonAccessModFinal na=new NonAccessModFinal("David");
        assertEquals("David", na.getName());
        /*na.setName("Charlie");
        assertEquals("Charlie", na.getName());*/

    }
}
