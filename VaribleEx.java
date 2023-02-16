public class VaribleEx {
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
            VaribleEx obj = new VaribleEx();
            obj.method(30);
        }
    }



