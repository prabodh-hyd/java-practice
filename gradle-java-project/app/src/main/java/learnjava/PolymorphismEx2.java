package learnjava;

public class PolymorphismEx2 {
    /* Runtime Polymorphism:It is also known as Dynamic Method Dispatch. It is a process in which a function call to the 
    overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding.  */

	// Method of parent class
	void Print()
	{

		// Print statement
		System.out.println("parent class");
	}
}

// Class 2
// Helper class
class subclass1 extends PolymorphismEx2 {

	// Method
	void Print() { System.out.println("subclass1"); }
}

// Class 3
// Helper class
class subclass2 extends PolymorphismEx2 {

	// Method
	void Print()
	{

		// Print statement
		System.out.println("subclass2");
	}
}

// Class 4
// Main class
class RuntimePolymorphism {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of class 1
		PolymorphismEx2 a;

		// Now we will be calling print methods
		// inside main() method

		a = new subclass1();
		a.Print();

		a = new subclass2();
		a.Print();
	}
}

    

