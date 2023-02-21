package in.prabodh;

public class MethodOverLoading {
    /*Method Overloading allows different methods to have the same name,
     but different signatures where the signature can differ by the number of input parameters or
     type of input parameters, or a mixture of both.
     Overloaded sum(). This sum takes two int parameters*/
        public int sum(int x, int y) { return (x + y); }

        // Overloaded sum(). This sum takes three int parameters
        public int sum(int x, int y, int z)
        {
            return (x + y + z);
        }

        // Overloaded sum(). This sum takes two double
        // parameters
        public double sum(double x, double y)
        {
            return (x + y);
        }

        // Driver code
        public static void main(String args[])
        {
            MethodOverLoading s = new MethodOverLoading();
            System.out.println(s.sum(10, 20));
            System.out.println(s.sum(10, 20, 30));
            System.out.println(s.sum(10.5, 20.5));
        }
    }


