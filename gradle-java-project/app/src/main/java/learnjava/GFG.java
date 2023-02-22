package learnjava;


/*anonymous inner class is a class that is defined and instantiated in a single expression, without specifying
 a name for the class. Anonymous inner classes are commonly used to implement interface or abstract classes
  with a single method, also known as functional interfaces, such as ActionListener or Runnable.*/

// Interface
interface Age {

	// Defining variables and methods
	int x = 21;
	void getAge();
}

// Class 1
// Helper class implementing methods of Age Interface
class MyClass1 implements Age {

	// Overriding getAge() method
	@Override public void getAge()
	{
		// Print statement
		System.out.print("Age is " + x);
	}
}

// Class 2
// Main class
// AnonymousDemo
class GFG1 {
	// Main driver method
	public static void main(String[] args)
	{
		// Class 1 is implementation class of Age interface
		MyClass1 obj = new MyClass1();

		// calling getage() method implemented at Class1
		// inside main() method
		obj.getAge();
	}
}

    

