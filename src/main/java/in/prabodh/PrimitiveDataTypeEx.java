package in.prabodh;

public class PrimitiveDataTypeEx2 {
    /*Primitive data are only single values and have no special capabilities
    boolean,byte,char,short,int,long,double,float
    There are five types of non-primitive data types in Java. They are as follows:
    Class,Object,String,Array,Interface*/


    public static void main(String[] args) {

            // declare and initialize variables of different numeric data types
            char charValue = 'A';
            int intValue = 1000;
            short shortValue = 30000;
            long longValue = 9223372036854775807L;
            double doubleValue = 3.141592653589793;
            float floatValue = 2.718281828459045f;

            // print the values of the variables
            System.out.println("charValue = " + charValue);
            System.out.println("intValue = " + intValue);
            System.out.println("shortValue = " + shortValue);
            System.out.println("longValue = " + longValue);
            System.out.println("doubleValue = " + doubleValue);
            System.out.println("floatValue = " + floatValue);

            // perform arithmetic operations using the variables
            int sum = intValue + shortValue;
            long product = longValue * intValue;
            double quotient = doubleValue / floatValue;

            // print the results of the arithmetic operations
            System.out.println("intValue + shortValue = " + sum);
            System.out.println("longValue * intValue = " + product);
            System.out.println("doubleValue / floatValue = " + quotient);
        }
    }


