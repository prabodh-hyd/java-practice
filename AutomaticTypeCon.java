public class AutomaticTypeCon {
    // Widening or automatic conversion takes place when two data types are automatically converted.
    //byte-short-int-long-float-double
    // Main driver method
        public static void main(String[] args)
        {
            int i = 100;

            // Automatic type conversion
            // Integer to long type
            long l = i;

            // Automatic type conversion
            // long to float type
            float f = l;

            // Print and display commands
            System.out.println("Int value " + i);
            System.out.println("Long value " + l);
            System.out.println("Float value " + f);
        }
    }


