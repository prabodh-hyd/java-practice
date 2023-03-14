package learnjava;

// a user can decide among multiple options.The if statements are executed from the top down.
public class IfElseIfLadderExample {
    public String ladderMethod(int grade){

            if (grade >= 90) {
            return "Your grade is A.";
            } else if (grade >= 80) {
                return "Your grade is B.";
            } else if (grade >= 70) {
                return "Your grade is C.";
            } else if (grade >= 60) {
                return "Your grade is D.";
            } else {
                return "Your grade is F.";
            }
            
        }
    }


