package learnjava;

 class PrivateAccessEx{
    /* A class member declared as "private" can only be accessed from within the same class in which it is 
    defined. It cannot be accessed from outside the class, including its subclasses. */

     private String name;

     // getter method
     public String getName() {
         return name;
     }


     // setter method
     public String setName(String name) {
         return this.name = name;
     }
 }

     


