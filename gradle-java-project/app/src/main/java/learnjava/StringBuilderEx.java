package learnjava;

public class StringBuilderEx {
/*StringBuilder class provides an alternative to String Class, as it creates a mutable sequence of characters.
 The function of StringBuilder is very much similar to the StringBuffer class, as both of them provide an
  alternative to String Class by making a mutable sequence of characters.  */

	public static void main(String[] argv)
		throws Exception
	{

		// create a StringBuilder object
		// with a String pass as parameter
		StringBuilder str
			= new StringBuilder("AAAABBBCCCC");

		// print string
		System.out.println("String = "
						+ str.toString());

		// reverse the string
		StringBuilder reverseStr = str.reverse();

		// print string
		System.out.println("Reverse String = "
						+ reverseStr.toString());

		// Append ', '(44) to the String
		str.appendCodePoint(44);

		// Print the modified String
		System.out.println("Modified StringBuilder = "
						+ str);

		// get capacity
		int capacity = str.capacity();

		// print the result
		System.out.println("StringBuilder = " + str);
		System.out.println("Capacity of StringBuilder = "
						+ capacity);
	}
}
