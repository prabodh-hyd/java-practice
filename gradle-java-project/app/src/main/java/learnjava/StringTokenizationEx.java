package learnjava;

import java.util.StringTokenizer;

public class StringTokenizationEx {

/*StringTokenizer class in Java is used to break a string into tokens. A StringTokenizer object internally
 maintains a current position within the string to be tokenized. Some operations advance this current position
  past the characters processed.
 */

	public static String[] tokenizeString(String input, String delimiter) {
	  StringTokenizer tokenizer = new StringTokenizer(input, delimiter);
	  String[] tokens = new String[tokenizer.countTokens()];
	  int index = 0;
	  while (tokenizer.hasMoreTokens()) {
		tokens[index++] = tokenizer.nextToken();
	  }
	  return tokens;
	}
  
  }
  

