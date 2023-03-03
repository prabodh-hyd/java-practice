package learnjava;

public class Arrayex {
    /*an array is a data structure that stores a fixed-size sequential collection of elements of the same
     data type. An array is a container object that holds a fixed number of values of a single type.
     */
    
    public int calculateAverage(int[] numbers1) {
        int sum = 0;
        int arrayLength = numbers1.length;
        for (int  number: numbers1) {
            sum += number;
          
        }
            int average =   sum / arrayLength;
           return average;
    
    }
}
       

