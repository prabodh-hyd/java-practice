package learnjava;

// a user can decide among multiple options.The if statements are executed from the top down.
public class IfElseIfLadderExample {
    public void ladderMethod(int grade){

            if (grade >= 90) {
                System.out.println("Your grade is A.");
            } else if (grade >= 80) {
                System.out.println("Your grade is B.");
            } else if (grade >= 70) {
                System.out.println("Your grade is C.");
            } else if (grade >= 60) {
                System.out.println("Your grade is D.");
            } else {
                System.out.println("Your grade is F.");
            }
        }
    }


