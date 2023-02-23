package learnjava;

public class PolymorphismEx1 {
    /* Polymorphism allows us to perform a single action in different ways. In other words, polymorphism allows
     you to define one interface and have multiple implementations.In Java polymorphism is mainly divided into two types: 
     Compile-time Polymorphism
     Runtime Polymorphism */
     //Compile-time Polymorphism: This type of polymorphism is achieved by function overloading or operator overloading. 
      //this program is example on static polymorphism
      // Method with 2 integer parameters
	static int Multiply(int a, int b)
	{

		// Returns product of integer numbers
		return a * b;
	}

	// Method 2
	// With same name but with 2 double parameters
	static double Multiply(double a, double b)
	{

		// Returns product of double numbers
		return a * b;
	}
}

// Class 2
// Main class
     class StaticPolymorphism {

	// Main driver method
	     public static void main(String[] args)
	        {

		// Calling method by passing
		// input as in arguments
		System.out.println(PolymorphismEx1.Multiply(2, 4));
		System.out.println(PolymorphismEx1.Multiply(5.5, 6.3));
	}
}


