
package learnjava;
/*
 abstract class cannot be instantiated directly, and it can only be used as a superclass for other classes.
An abstract method has no implementation and must be implemented by any subclass that inherits from the parent class.
 */
    // abstract class
 abstract class Animal2 {
        public String makeSound() {
          String  str1="The animal makes a sound";
        return str1;
        }
    }
    //extending abstract class
    public class AbstractNonAccessMod extends Animal2 {
        @Override
        public String makeSound() {
            String str="Bow";
            return str;
         
        }
    }
    
    


