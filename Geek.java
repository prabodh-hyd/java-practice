public class Geek {
    Geek(String name)
    {
        System.out.println("Constructor with one "
                + "argument - String : " + name);
    }

    // constructor with two arguments
    Geek(String name, int age)
    {

        System.out.println(
                "Constructor with two arguments : "
                        + " String and Integer : " + name + " " + age);
    }

    // Constructor with one argument but with different
    Geek(long id)
    {
        System.out.println(
                "Constructor with one argument : "
                        + "Long : " + id);
    }
}

class GFG {
    public static void main(String[] args)
    {
        Geek geek2 = new Geek("Shikhar");

        // Invoke the constructor with two arguments
        Geek geek3 = new Geek("Dharmesh", 26);

        // Invoke the constructor with one argument of
        // type 'Long'.
        Geek geek4 = new Geek(325614567);
    }
}
