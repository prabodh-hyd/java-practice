package learnjava;

 class Nestedclass {
  /*nested classes in Java are classes that are defined within another class. There are four types of nested
   classes: static nested classes, inner classes, local classes, and anonymous classes. Nested classes are
   commonly used to group related classes together and to hide implementation details from other classes. */
          private int outerVariable = 100;
      
        class InnerClass {
          public void accessOuterVariable() {
            System.out.println("Accessing outer variable from inner class: " + outerVariable);
          }
        }
      
        public void createInnerClassObject() {
          InnerClass inner = new InnerClass();
          inner.accessOuterVariable();
        }
    }
      
       class Main1{
        public static void main(String[] args) {
            Nestedclass outer = new Nestedclass();
          outer.createInnerClassObject();
        }
      }
    
    

