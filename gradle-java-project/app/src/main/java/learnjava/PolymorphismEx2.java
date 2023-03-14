package learnjava;

public class PolymorphismEx2 {
    /* Runtime Polymorphism:It is also known as Dynamic Method Dispatch. It is a process in which a function call to the 
    overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding.  */

	// Method of parent class
	String Print()
	{

		// Print statement
		
		return "parent class";
	}
}

// Class 2
// Helper class
class Subclass1 extends PolymorphismEx2 {

	// Method
	String Print() { 
	return "subclass1"; 
	}
}

class Subclass2 extends PolymorphismEx2 {

	// Method
	String Print()
	{

		// Print statement
		
		return "subclass2";
	}
}



    

