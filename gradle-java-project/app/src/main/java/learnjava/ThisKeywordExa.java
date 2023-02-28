package learnjava;

public class ThisKeywordExa {
        /*this is used to access methods of the current class.it is a resrved word in java.
         we cannt use its as an identifier.*/
        int a = 10;   // instance variable

        // static variable
        static int b = 20;

        void GFG()
        {
            // referring current class(i.e, class RR)
            // instance variable(i.e, a)
            this.a = 100;

            System.out.println(a);

            // referring current class(i.e, class RR)
            // static variable(i.e, b)
            ThisKeywordExa.b = 600;

            System.out.println(b);
        }
        
    

        public static void main(String[] args)
        {

            new ThisKeywordExa().GFG();
        }
    }

