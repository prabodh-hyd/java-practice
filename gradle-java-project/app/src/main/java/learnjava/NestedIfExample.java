package learnjava;

        /*A nested if is an if statement that is the target of another if or else.
        Nested if statements mean an if statement inside an if statement.*/
    public class NestedIfExample {
        public String nestedif(int age,double height) {
                  if (age >= 18) {
                    if (height >= 160) {
                    return "You are eligible to ride the roller coaster.";
                    } else {
                      return  "You are not tall enough to ride the roller coaster.";
                    }
                } else {
                    return "You are not old enough to ride the roller coaster.";
                }
                
            }
        }
    


