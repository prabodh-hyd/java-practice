package learnjava;
 class Animals {
    /*Inheritance is a mechanism in Java that allows a new class to be based on an existing class,
     inheriting its properties and behavior. The class that is being inherited is called the 
     "parent" or "super" class, and the new class is called the "child" or "sub" class. */
    private String name;
    private int age;
    
    public Animals(String name, int age) {
       this.name = name;
       this.age = age;
    }
    
    public String getName() {
       return name;
    }
    
    public int getAge() {
       return age;
    }
    
    public void eat() {
       System.out.println(name + " is eating");
    }
 }
 
  class Dog extends Animals {
    private String breed;
    
    public Dog(String name, int age, String breed) {
       super(name, age);
       this.breed = breed;
    }
    
    public String getBreed() {
       return breed;
    }
    
    public void bark() {
       System.out.println(getName() + " is barking");
    }
 }
 
 public class InheritanceEx {
    public static void main(String[] args) {
       Dog myDog = new Dog("Rex", 3, "Labrador");
       System.out.println("Name: " + myDog.getName());
       System.out.println("Age: " + myDog.getAge());
       System.out.println("Breed: " + myDog.getBreed());
       myDog.eat();
       myDog.bark();
    }
 }
 


