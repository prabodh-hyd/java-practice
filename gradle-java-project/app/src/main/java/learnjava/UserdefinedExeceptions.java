package learnjava;

// A Class that represents use-defined exception

class InvalidAgeException  extends Exception
{
    public InvalidAgeException (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}

// class that uses custom exception InvalidAgeException
    public class UserdefinedExeceptions
     {

    // method to check the age
         static void validate (int age) throws InvalidAgeException{
        if(age < 18){

            // throw an object of user defined exception
            throw new InvalidAgeException("age is not valid to vote");
        }
        else {
            System.out.println("welcome to vote");
        }
    }


}
