package learnjava;

/*a static inner class is a nested class that is declared as static within another class.
 Static inner classes can be accessed without creating an instance of the enclosing class, and they can 
 access static members of the enclosing class.
 */
    public class InnerClassesEx {
        private static int outerStaticVariable = 10;
        static class StaticInnerClass {
           public void printVariables() {
              System.out.println("Outer Static Variable: " + outerStaticVariable);
           }
        }
     
        public void createInnerClass() {
           StaticInnerClass innerClass = new StaticInnerClass();
           innerClass.printVariables();
        }
     
        public static void main(String[] args) {
            InnerClassesEx outerClass = new InnerClassesEx();
           outerClass.createInnerClass();
        }
     }
     
    

