package learnjava;

 class Nestedclass {
  /*nested classes in Java are classes that are defined within another class. There are four types of nested
   classes: static nested classes, inner classes, local classes, and anonymous classes. Nested classes are
   commonly used to group related classes together and to hide implementation details from other classes. */
          private static int outerVariable = 100;
      
        static class InnerClass {
          public static int accessOuterVariable() {
            return outerVariable;
           
          }
        }
      
        public int createInnerClassObject() {
         
           return InnerClass.accessOuterVariable();
        }
    }
      
       
      
    
    

