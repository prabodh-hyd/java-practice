package learnjava;


    class ExceptionHandlingExample {
      /*an exception is an error that occurs during the execution of a program. Exception handling is the 
      process of identifying, catching, and handling exceptions in a program. When an exception occurs,
       Java creates an object of the corresponding exception class and throws it.
       */
        public void testException() {
          try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
          } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero");
          } finally {
            System.out.println("This block is always executed");
          }
          System.out.println("Program continues after the try-catch block");
        }
      }
      
    

