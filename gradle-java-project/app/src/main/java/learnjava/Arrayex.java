package learnjava;

public class Arrayex {
    /*an array is a data structure that stores a fixed-size sequential collection of elements of the same
     data type. An array is a container object that holds a fixed number of values of a single type.
     */
    public static void main(String[] args) {

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        // access all elements using for each loop
        // add each element in sum
        for (int number: numbers) {
            sum += number;
        }

        // get the total number of elements
        int arrayLength = numbers.length;

        // calculate the average
        // convert the average from int to double
        average =  ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
