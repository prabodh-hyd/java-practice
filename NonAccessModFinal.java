 import java.io.*;
//In this we are override the final method in final_gfg.then we get error.we can not inherit the final class and method
    class final_gfg{
        void myMethod(){
            System.out.println("GeeksforGeeks");
        }
    }
    class override_final_gfg extends final_gfg{
        // trying to override the method available on final_gfg class
        void myMethod(){
            System.out.println("Overrides GeeksforGeeks");
        }
    }
    class NonAccessModFinal{
        public static void main(String[] args) {
            override_final_gfg obj=new override_final_gfg();
            obj.myMethod();
        }
    }

