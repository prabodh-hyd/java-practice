package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringBufferTest {

  private StringBufferEx sbExample;

  @Before
  public void setUp() {
    sbExample = new StringBufferEx();
  }

  @Test
  public void testAppendString() {
    String result = sbExample.appendString("Hello", " world");
    assertEquals("Hello world", result);
  }

  @Test
  public void testInsertString() {
    String result = sbExample.insertString("Hello", ", ", 5);
    assertEquals("Hello, ", result);
  }

  @Test
  public void testReplaceString() {
    String result = sbExample.replaceString("Hello,world", "there", 6, 11);
    assertEquals("Hello,there", result);
  }

  @Test
  public void testDeleteString() {
    String result = sbExample.deleteString("Hello, there", 5, 6);
    assertEquals("Hello there", result);
  }

  @Test
  public void testReverseString() {
    String result = sbExample.reverseString("Hello");
    assertEquals("olleH", result);
  }
}
