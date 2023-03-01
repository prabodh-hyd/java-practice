package in.prabodh;

//Static inner class example program
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
     
    

