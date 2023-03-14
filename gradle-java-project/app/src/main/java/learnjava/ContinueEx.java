package learnjava;

public class ContinueEx {
    /*Java supports three jump statements: break, continue and return.Terminate a sequence in a switch statement 
     Sometimes it is useful to force an early iteration of a loop. That is, you might want to continue running
      the loop but stop processing the remainder of the code in its body for this particular iteration.*/

	public int continueM()
	{
		int[] numbers = {1, 2, 3, 4, 5};
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			
            if (numbers[i] % 2 == 0) {
				
                continue; // Skip even numbers
            }
            sum += numbers[i];
        }
		return sum;
        
		
		
		
	}
}


