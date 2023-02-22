package learnjava;

public class OuterClass {
       /*a local inner class is a nested class that is defined inside a method or a block of code.
        A local inner class can only be accessed within the block in which it is defined. */
    
        public void createLocalInnerClassObject() {
          class LocalInnerClass {
            public void printMessage() {
              System.out.println("This is a message from the local inner class.");
            }
          }
          LocalInnerClass localInner = new LocalInnerClass();
          localInner.printMessage();
        }
      }
      
       class Main2 {
        public static void main(String[] args) {
          OuterClass outer = new OuterClass();
          outer.createLocalInnerClassObject();
        }
      }
      

