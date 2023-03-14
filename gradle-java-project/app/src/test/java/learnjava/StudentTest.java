package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {
    @Test 
    public void testParameterizedConstructor(){
        int i=1;
        String name="shiva";
        Student1 s=new Student1(i,name);
        assertEquals("shiva", s.getname());
        assertEquals(1, s.getId());
        
        
    }
    
}
