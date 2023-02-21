public class VariableEx {
   /*a variable is a named storage location in the computer's memory that can hold a value of a
   particular data type. Variables are used to store data that can be manipulated or used in a program.
    Variables in Java are strongly typed, which means that the type of the variable must be declared
    before it can be used.*/


        // Static variable
        static int staticVar = 10;

        // Instance variable
        int instanceVar = 20;

        public void method(int localVar) {
            // Local variable
            int sum = staticVar + instanceVar + localVar;
            System.out.println("Sum of variables: " + sum);
        }

        public static void main(String[] args) {
            VariableEx obj = new VariableEx();
            obj.method(30);
        }
    }



