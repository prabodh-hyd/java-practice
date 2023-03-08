package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;





public class AbstractionTest {
    
    @Test
    public void testRectangle(){
        Shape rectangle = new Rectangle();
        Shape circle=new Circle();
        
        assertEquals("Drawing a rectangle", rectangle.draw());
        assertEquals("Drawing a circle",circle.draw());
    }
}
  
