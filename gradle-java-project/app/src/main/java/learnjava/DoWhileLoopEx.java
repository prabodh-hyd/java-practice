package learnjava;

public class DoWhileLoopEx {
    /*do while loop is similar to while loop with only difference that it checks for condition after
    executing the statements*/
    public int dowhileloop() {
       
        int i = 0;
        int sum = 0;
        
        do {
            i++;
            sum += i;
        } while (i < 5);
        return sum;
    }
}

