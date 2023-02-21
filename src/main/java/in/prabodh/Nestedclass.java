package in.prabodh;

 class Nestedclass {
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
      
       class Main {
        public static void main(String[] args) {
            Nestedclass outer = new Nestedclass();
          outer.createInnerClassObject();
        }
      }
    
    

