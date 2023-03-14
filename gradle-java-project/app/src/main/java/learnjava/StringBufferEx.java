package learnjava;

public class StringBufferEx {


	/*StringBuffer is a peer class of String that provides much of the functionality of strings. The string 
represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences. */
	// Main driver method
	
		public String appendString(String s1, String s2) {
		  StringBuffer sb = new StringBuffer(s1);
		  sb.append(s2);
		  return sb.toString();
		}
	  
		public String insertString(String s1, String s2, int index) {
		  StringBuffer sb = new StringBuffer(s1);
		  sb.insert(index, s2);
		  return sb.toString();
		}
	  
		public String replaceString(String s1, String s2, int startIndex, int endIndex) {
		  StringBuffer sb = new StringBuffer(s1);
		  sb.replace(startIndex, endIndex, s2);
		  return sb.toString();
		}
	  
		public String deleteString(String s1, int startIndex, int endIndex) {
		  StringBuffer sb = new StringBuffer(s1);
		  sb.delete(startIndex, endIndex);
		  return sb.toString();
		}
	  
		public String reverseString(String s1) {
		  StringBuffer sb = new StringBuffer(s1);
		  sb.reverse();
		  return sb.toString();
		}
	  }
	  
