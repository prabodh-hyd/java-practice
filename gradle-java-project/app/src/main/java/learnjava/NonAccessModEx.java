package learnjava;

class NonAccessModEx {
       /* "static" non-access modifier in Java is used to indicate that a variable, method, or inner class
        belongs to the class itself rather than to any instance of the class. 
        */
        // static variable
        static int count = 0;
        int myMethod()
        {
            count++;
            
            return count;
        }
    }
    


