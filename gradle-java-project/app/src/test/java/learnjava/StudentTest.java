package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {
    @Test 
    public void testParameterizedConstructor(){
        int i=1;
        String name="shiva";
        Student s=new Student(i,name);
        assertEquals("shiva", s.getname());
        assertEquals(1, s.getId());
        
        
    }
    
}
