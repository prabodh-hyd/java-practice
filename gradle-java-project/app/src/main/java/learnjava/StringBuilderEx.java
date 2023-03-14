package learnjava;

public class StringBuilderEx {
/*StringBuilder class provides an alternative to String Class, as it creates a mutable sequence of characters.
 The function of StringBuilder is very much similar to the StringBuffer class, as both of them provide an
  alternative to String Class by making a mutable sequence of characters.  */

	

       public String reverseString() {
		     String s="amar";
	          StringBuffer sb = new StringBuffer(s);
	          sb.reverse();
			  return sb.toString();
          }
		
      public int capacityString(){
		String str1 = "Hello, world!";
		StringBuffer sb=new StringBuffer(str1);
		int capacity = sb.capacity();
		return capacity;
	  }
		
		

		
	}

