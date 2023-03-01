package in.prabodh;

    // abstract class
    abstract class Abstract_gfg{
        abstract void myMethod();
    }

    //extending abstract class
    class MyClass extends Abstract_gfg{

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


