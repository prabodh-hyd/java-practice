package learnjava;

public class ConstructorEx {
    /*a constructor is a special method that is used to create an object of a class.
     Constructors have the same name as the class and do not have a return type, not even void.*/
        private String name;
        private int age;
        
        // Default constructor
        public ConstructorEx() {
            this.name = "";
            this.age = 0;
        }
        
        // Constructor with parameters
        public ConstructorEx(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        // Getter methods
        public String getName() {
            return name;
        }
        
        public int getAge() {
            return age;
        }
    }
    
    




