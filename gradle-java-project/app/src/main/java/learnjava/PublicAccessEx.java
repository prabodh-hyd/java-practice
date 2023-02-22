package learnjava;

 class Animal {
    /*A class member declared as "public" can be accessed from any class, including its subclasses and
     classes in different packages. */
    // public variable
    public int legCount;

    // public method
    public void display() {
        System.out.println("I am an animal.");
        System.out.println("I have " + legCount + " legs.");
    }
}
public class PublicAccessEx {
    public static void main(String[] args) {
        // accessing the public class
        Animal animal = new Animal();

        // accessing the public variable
        animal.legCount = 4;
        // accessing the public method
        animal.display();
    }
}
