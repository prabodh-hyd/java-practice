package learnjava;

    public class OperatorsEx {
    //operators are special symbols that represent certain operations on variables or values.
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            int c = 0;

            // Arithmetic Operations
            c = a + b;
            System.out.println("a + b = " + c);

            c = a - b;
            System.out.println("a - b = " + c);

            c = a * b;
            System.out.println("a * b = " + c);

            c = b / a;
            System.out.println("b / a = " + c);

            c = b % a;
            System.out.println("b % a = " + c);

            // Comparison Operations
            boolean isEqual = (a == b);
            System.out.println("a == b = " + isEqual);

            isEqual = (a != b);
            System.out.println("a != b = " + isEqual);

            isEqual = (a > b);
            System.out.println("a > b = " + isEqual);

            isEqual = (a < b);
            System.out.println("a < b = " + isEqual);

            isEqual = (a >= b);
            System.out.println("a >= b = " + isEqual);

            isEqual = (a <= b);
            System.out.println("a <= b = " + isEqual);

            // Logical Operations
            boolean isTrue = true;
            boolean isFalse = false;
            System.out.println("isTrue && isFalse = " + (isTrue && isFalse));
            System.out.println("isTrue || isFalse = " + (isTrue || isFalse));
            System.out.println("!isTrue = " + !isTrue);
        }
    }


