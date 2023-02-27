package gradletwo;

public class ForLoopExample {
    /*for statement consumes the initialization, condition and increment/decrement in one line thereby
     providing a shorter,easy to debug structure of looping. */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i; // add i to sum
        }
        System.out.println("The sum of the first 10 positive integers is " + sum);
    }
}
