package learnjava;


/*anonymous inner class is a class that is defined and instantiated in a single expression, without specifying
 a name for the class. Anonymous inner classes are commonly used to implement interface or abstract classes
  with a single method, also known as functional interfaces, such as ActionListener or Runnable.*/

// Interface
interface Age {

	// Defining variables and methods
	int x = 21;
	int getAge();
}

// Class 1
// Helper class implementing methods of Age Interface
class AnonymousInnerClass implements Age {

	// Overriding getAge() method
	@Override
	 public int getAge()
	{
		// Print statement
		
		return x;
	}
}



    

