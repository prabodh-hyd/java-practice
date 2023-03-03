package learnjava;

public class ExampleMinNumber {
    /*a method is a block of code that performs a specific task and can be called by other parts of a program.
     A method can be thought of as a function that takes input parameters, performs some operation on them,
      and returns a result.
     */
    public int testMin() {
        int a = 11;
        int b = 6;
        int c = minFunction(a, b);
        return c;
    }

    /** returns the minimum of two numbers */
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }
}
