package learnjava;
import java.util.*;
public class ContinueEx {
    /*Java supports three jump statements: break, continue and return.Terminate a sequence in a switch statement 
     Sometimes it is useful to force an early iteration of a loop. That is, you might want to continue running
      the loop but stop processing the remainder of the code in its body for this particular iteration.*/

	public static void main(String args[])
	{
		for (int i = 0; i < 10; i++) {
			// If the number is even
			// skip and continue
			if (i % 2 == 0)
				continue;

			// If number is odd, print it
			System.out.print(i + " ");
		}
	}
}


