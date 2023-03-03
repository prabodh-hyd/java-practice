package learnjava;

import java.util.Scanner;

public class SwitchExample {
    //switch statement allows you to select one of several possible code blocks to execute based on the value of a variable.
    
    public String getDayName(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                throw new IllegalArgumentException("Invalid day of week: " + dayOfWeek);
        }
    }
    
           
           
        }
    
    
        
        
    


