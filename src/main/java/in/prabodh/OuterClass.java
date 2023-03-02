package in.prabodh;

public class OuterClass {
       //Local inner class example program:
    
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
      
       class Main3 {
        public static void main(String[] args) {
          OuterClass outer = new OuterClass();
          outer.createLocalInnerClassObject();
        }
      }
      

