package learnjava;

   public class StringMethodsEx {
    
/*String is a sequence of characters. In java, objects of String are immutable which means a constant and
 cannot be changed once created. */
		
		// or String s= new String ("GeeksforGeeks");

		// Returns the number of characters in the String.
		public int lengthOfString(){
			String s= "GeeksforGeeks";
			return s.length();
		}

		// Returns the character at ith index.
		public char charOfString(){
			String s= "GeeksforGeeks";
			return s.charAt(3);
		}

		// Return the substring from the ith index character
		// to end of string
		public String subString(){
			String s= "GeeksforGeeks";
			return s.substring(3,5);
		}
		// Concatenates string2 to the end of string1.
		public String concatenate(){
		String s1 = "Geeks";
		String s2 = "forGeeks";
		return s1.concat(s2);
		}
		
		// Returns the index within the string
		// of the first occurrence of the specified string.
		public int indexOfString(){
			String s4 = "Learn Share Learn";
			return s4.indexOf("Share");
		}

		// Checking equality of Strings
		public boolean equla(){
			Boolean out = "Geeks".equals("geeks");
		return out;
		}
		public int compare(){
			String s1="apple";
			String s2="banana";
			int out1 = s1.compareTo(s2);
			return out1;

		}
		// Converting cases
		public String lowercase()
		{
			String word1 = "GeeKyMe";
			return word1.toLowerCase();
		}
		
		public String uppercase(){
			String word2 = "GeekyME";
			return word2.toUpperCase();
		}
	   public String trim(){
		String word4 = "  Hello, world!  ";
         return word4.trim();
	   }
		// Replacing characters
     public String replace(){
		String str1 = "feeksforfeeks";
		String str2 = str1.replace('f' ,'g') ;
		return str2;
	}
}

