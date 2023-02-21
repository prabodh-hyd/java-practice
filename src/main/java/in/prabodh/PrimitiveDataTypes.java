package in.prabodh;

public class PrimitiveDataType2 {
  //Primitive data are only single values and have no special capabilities
    public static void main(String[] args) {

        // declare and initialize boolean variables
        boolean isTrue = true;
        boolean isFalse = false;

        // print the values of the variables
        System.out.println("isTrue = " + isTrue);
        System.out.println("isFalse = " + isFalse);

        // use boolean operators to perform logical operations
        boolean result1 = isTrue && isFalse;  // logical AND
        boolean result2 = isTrue || isFalse;  // logical OR
        boolean result3 = !isTrue;  // logical NOT

        // print the results of the logical operations
        System.out.println("isTrue && isFalse = " + result1);
        System.out.println("isTrue || isFalse = " + result2);
        System.out.println("!isTrue = " + result3);
    }
}
