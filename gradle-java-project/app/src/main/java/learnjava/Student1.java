package learnjava;

public class Student1 {
    /*A parameterized constructor is a constructor that takes one or more parameters as input.
     These parameters are used to initialize the object's instance variables. Parameterized constructors
      are useful when you want to create objects with different initial values. */
    int id;
    String name;
    //creating a parameterized constructor
    Student1(int i,String n){
        id = i;
        name = n;
    }

    public String  getname() {
        return name;
    }
    public int getId() {
        return id;
    }

    
}
