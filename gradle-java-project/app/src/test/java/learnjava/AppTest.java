/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package learnjava;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test 
    public void sumOfVariables(){
        int result=VariableEx.method(10,20);
        assertEquals(30, result);
    }
}
