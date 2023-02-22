package learnjava;

public class ConstructorEx {
    /*a constructor is a special method that is used to create an object of a class.
     Constructors have the same name as the class and do not have a return type, not even void.*/
    ConstructorEx(String name)
    {
        System.out.println("Constructor with one "
                + "argument - String : " + name);
    }

    // constructor with two arguments
    ConstructorEx(String name, int age)
    {

        System.out.println(
                "Constructor with two arguments : "
                        + " String and Integer : " + name + " " + age);
    }

    // Constructor with one argument but with different
    ConstructorEx(long id)
    {
        System.out.println(
                "Constructor with one argument : "
                        + "Long : " + id);
    }
}

class GFG {
    public static void main(String[] args)
    {
        ConstructorEx geek2 = new ConstructorEx("Shikhar");

        // Invoke the constructor with two arguments
        ConstructorEx geek3 = new ConstructorEx("Dharmesh", 26);

        // Invoke the constructor with one argument of
        // type 'Long'.
        ConstructorEx geek4 = new ConstructorEx(325614567);
    }
}
