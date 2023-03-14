package learnjava;


    class ExceptionHandlingExample {
      /*an exception is an error that occurs during the execution of a program. Exception handling is the 
      process of identifying, catching, and handling exceptions in a program. When an exception occurs,
       Java creates an object of the corresponding exception class and throws it.
       */
      public int divideByZero() throws ArithmeticException {
        int a = 10;
        int b = 0;
        int result = a/b;
        return result;
      }
      
      public int nullPointer() throws NullPointerException {
        String str = null;
        int length = str.length();
        return length;
      }
      
    }
      
      
    

