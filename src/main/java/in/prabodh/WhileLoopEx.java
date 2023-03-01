package in.prabodh;

import java.util.Scanner;

public class WhileLoopEx {
    //Entry control loop
    //Once the condition is evaluated to true, the statements in the loop body are executed.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0;

        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        while (number > 0) {
            sum += number;
            number--;
        }

        System.out.println("The sum of the integers from 1 to " + number+ " is " + sum + ".");
    }
}

