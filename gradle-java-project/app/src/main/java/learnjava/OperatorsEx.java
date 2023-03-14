package learnjava;

    public class OperatorsEx {
    //operators are special symbols that represent certain operations on variables or values.
        
            int a = 10;
            int b = 20;
            int c = 0;

            // Arithmetic Operations
            public  int sum(){
                c = a + b;
                return c;
            }
            public int sub(){
                c = a - b;  
                return c;
            }
        
            public int multiply(){
                c = a * b;  
                return c;
            }
            
            public int division(){
                c = b / a;
                return c;
            }
           public int modulodivision(){
            c = b % a;
            return c;
           }
           
        

            // Comparison Operations
            boolean isEqual(){
              boolean c= (a == b);
              return c;
            }
            
           boolean notEqual()
           {
           boolean c = (a != b);
           return c;
             }            
            boolean greater(){
                boolean c = (a > b); 
                return c;
            }
            boolean lessthan(){
                boolean c =(a < b);
                return c;
            }
            boolean greaterThanOrEqual(){
                boolean c=(a >= b);
                return c;
            }
           boolean lessThanOrEqual(){
            boolean c=(a <= b);
            return c;
           }

           
        }
    


