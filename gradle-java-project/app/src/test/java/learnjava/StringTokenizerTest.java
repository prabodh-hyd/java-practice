package learnjava;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class StringTokenizerTest{
    @Test
  public void testTokenizeStringWithComma() {
    String input = "hello,world,how,are,you";
    String delimiter = ",";
    String[] expectedOutput = {"hello", "world", "how", "are", "you"};
    assertArrayEquals(expectedOutput, StringTokenizationEx.tokenizeString(input, delimiter));
  }

  @Test
  public void testTokenizeStringWithSpace() {
    String input = "hello world how are you";
    String delimiter = " ";
    String[] expectedOutput = {"hello", "world", "how", "are", "you"};
    assertArrayEquals(expectedOutput, StringTokenizationEx.tokenizeString(input, delimiter));
  }

  @Test
  public void testTokenizeStringWithTab() {
    String input = "hello\tworld\thow\tare\tyou";
    String delimiter = "\t";
    String[] expectedOutput = {"hello", "world", "how", "are", "you"};
    assertArrayEquals(expectedOutput, StringTokenizationEx.tokenizeString(input, delimiter));
  }

}
