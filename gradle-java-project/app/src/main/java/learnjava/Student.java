package learnjava;

public class Student {
    /*A parameterized constructor is a constructor that takes one or more parameters as input.
     These parameters are used to initialize the object's instance variables. Parameterized constructors
      are useful when you want to create objects with different initial values. */
    int id;
    String name;
    //creating a parameterized constructor
    Student(int i,String n){
        id = i;
        name = n;
    }
    //method to display the values
    void display()
    {
        System.out.println(id+" "+name);
    }

    public static void main(String args[]){
        //creating objects and passing values
        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(222,"Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}
