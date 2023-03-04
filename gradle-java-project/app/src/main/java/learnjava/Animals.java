package learnjava;
 class Animals {
    /*Inheritance is a mechanism in Java that allows a new class to be based on an existing class,
     inheriting its properties and behavior. The class that is being inherited is called the 
     "parent" or "super" class, and the new class is called the "child" or "sub" class. */
     
      public String eat() {
          return "An animal is eating...";
      }
  
      public String move() {
          return "An animal is moving...";
      }
  }
 
  class Dog extends Animals {
    
    
    public Dog() {
   }

   public String move() {
      return "A dog is running...";
  }

  public String bark() {
      return "A dog is barking...";
  }
 }
 
 


