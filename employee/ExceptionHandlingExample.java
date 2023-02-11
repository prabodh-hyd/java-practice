package employee;


    class ExceptionHandlingExample {
        public static void main(String[] args) {
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
      
    

