package learnjava;

public class OuterClass {
       /*a local inner class is a nested class that is defined inside a method or a block of code.
        A local inner class can only be accessed within the block in which it is defined. */
    
        public String createLocalInnerClassObject() {
          class LocalInnerClass {
            public String printMessage() {
             
              return "This is a message from the local inner class.";
            }
          }
          LocalInnerClass localInner = new LocalInnerClass();
          return localInner.printMessage();
        }
      }
      
      

