//Static inner class example program
    public class OuterClass {
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
           OuterClass outerClass = new OuterClass();
           outerClass.createInnerClass();
        }
     }
     
    

