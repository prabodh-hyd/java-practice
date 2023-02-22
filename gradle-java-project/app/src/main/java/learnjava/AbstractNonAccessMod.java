
package learnjava;
/*
 abstract class cannot be instantiated directly, and it can only be used as a superclass for other classes.
An abstract method has no implementation and must be implemented by any subclass that inherits from the parent class.
 */
    // abstract class
    abstract class abstract_gfg{
        abstract void myMethod();
    }

    //extending abstract class
    class MyClass extends abstract_gfg{

        // overriding abstract method otherwise
        // code will produce error
        void myMethod(){
            System.out.println("GeeksforGeeks");
        }
    }
    class AbstractNonAccessMod {
        public static void main(String[] args) {
            MyClass obj=new MyClass();
            obj.myMethod();
        }
    }


