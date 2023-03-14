package learnjava;

public class ThisKeywordExa {
        /*this is used to access methods of the current class.it is a resrved word in java.
         we cannt use its as an identifier.*/
        int a = 10;   // instance variable
        int gfg()
        {
            
            // instance variable(i.e, a)
            this.a = 100;
            return a;
        }
    }

