package learnjava;

public class ExplicitTypeCon{
    /*the target type specifies the desired type to convert the specified value to.
    double-float-long-int-short-Byte*/
        public static void main(String[] args)
        {

            // Double datatype
            double d = 100.04;

            // Explicit type casting by forcefully getting
            // data from long datatype to integer type
            long l = (long)d;

            // Explicit type casting
            int i = (int)l;

            // Print statements
            System.out.println("Double value " + d);

            // While printing we will see that
            // fractional part lost
            System.out.println("Long value " + l);

            // While printing we will see that
            // fractional part lost
            System.out.println("Int value " + i);
        }
    }


