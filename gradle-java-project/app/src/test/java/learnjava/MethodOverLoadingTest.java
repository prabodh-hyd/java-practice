package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MethodOverLoadingTest {
    @Test 
    public void testMethodLoading(){
        MethodOverLoading mo=new MethodOverLoading();
        int res=mo.sum(2,3);
        int res1=mo.sum(2,3,5);
        double res3=mo.sum(3,4);
        assertEquals(5,res);
        assertEquals(10,res1);
        assertEquals(7,res3,0.01);
        
    }
}
