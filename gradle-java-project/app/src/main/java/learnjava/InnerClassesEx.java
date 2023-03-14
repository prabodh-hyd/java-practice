package learnjava;

/*a static inner class is a nested class that is declared as static within another class.
 Static inner classes can be accessed without creating an instance of the enclosing class, and they can 
 access static members of the enclosing class.
 */
    public class InnerClassesEx {
        private static int outerStaticVariable = 10;
        static class StaticInnerClass {
           public static int printVariables() {
              return outerStaticVariable;
           }

         public static int createInnerClass() {
            return outerStaticVariable++;
         }
         
        }
     
   
     }
     
    

