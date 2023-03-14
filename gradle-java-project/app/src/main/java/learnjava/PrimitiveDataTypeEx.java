package learnjava;

public class PrimitiveDataTypeEx {
    /*Primitive data are only single values and have no special capabilities
    boolean,byte,char,short,int,long,double,float
    There are five types of non-primitive data types in Java. They are as follows:
    Class,Object,String,Array,Interface*/

            // declare and initialize variables of different numeric data types
            char charValue = 'A';
            int intValue = 1000;
            short shortValue = 30000;
            long longValue = 9223372036854775807L;
            double doubleValue = 3.141592653589793;
            float floatValue = 2.718281828459045f;

            public int sum(){
                int sum = intValue + shortValue;
                return sum;
              }
              public long product(){
                long intValue = 1000L;
                long product = longValue * intValue;
                return product;
              }
              public double quotient(){
                double quotient = doubleValue / floatValue;
                return quotient;
              }
            
    }


