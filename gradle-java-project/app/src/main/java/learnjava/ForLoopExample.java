package learnjava;

public class ForLoopExample {
    /*for statement consumes the initialization, condition and increment/decrement in one line thereby
     providing a shorter,easy to debug structure of looping. */
    public int findSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i; // add i to sum
        }
        
        return sum;
    }
}
