package learnjava;

import java.util.Scanner;

public class DoWhileLoopEx {
    /*do while loop is similar to while loop with only difference that it checks for condition after
    executing the statements*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        } while (number != 5);
        System.out.println("You entered the number 5.");
    }
}
