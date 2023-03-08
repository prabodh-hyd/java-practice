package learnjava;

    
        /*"protectedMethod()" are accessible from within the same class, its subclasses, 
        and classes in the same package.
         */
         class Animal {
            protected String name;
            
            public Animal(String name) {
                this.name = name;
            }
            
            protected String sleep() {
                
                return name + " is sleeping.";
            }
        }
        
        public class ProtectedEXDog extends Animal {
            public ProtectedEXDog(String name) {
                super(name);
            }
            
            public String bark() {
                
                return name + " is barking.";
            }
            
            public String goSleep() {
                return sleep();
            }
        }
        
        