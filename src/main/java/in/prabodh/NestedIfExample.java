package in.prabodh;
import java.util.Scanner;
        /*A nested if is an if statement that is the target of another if or else.
        Nested if statements mean an if statement inside an if statement.*/
    public class NestedIfExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            System.out.print("Enter your height in cm: ");
            double height = scanner.nextDouble();

            if (age >= 18) {
                if (height >= 160) {
                    System.out.println("You are eligible to ride the roller coaster.");
                } else {
                    System.out.println("You are not tall enough to ride the roller coaster.");
                }
            } else {
                System.out.println("You are not old enough to ride the roller coaster.");
            }
        }
    }


