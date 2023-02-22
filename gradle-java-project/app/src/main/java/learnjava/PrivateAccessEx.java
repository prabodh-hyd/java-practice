package learnjava;

 class Data {
    /* A class member declared as "private" can only be accessed from within the same class in which it is 
    defined. It cannot be accessed from outside the class, including its subclasses. */

     private String name;

     // getter method
     public String getName() {
         return this.name;
     }


     // setter method
     public void setName(String name) {
         this.name = name;
     }
 }

     public class PrivateAccessEx {
         public static void main(String[] main) {
             Data d = new Data();

             // access the private variable using the getter and setter
             d.setName("PrivateAccess");
             System.out.println(d.getName());
         }
     }


