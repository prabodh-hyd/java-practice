package learnjava;

public class WhileLoopEx {
    /*Entry control loop
    Once the condition is evaluated to true, the statements in the loop body are executed.*/
    
        public   int   exampleWhile(int number,int sum) {
             sum = 0;
             while (number > 0) {
                sum += number;
                number--;
            }
            return sum;
        }
    }


