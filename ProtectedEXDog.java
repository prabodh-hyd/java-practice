
    class Animal1 {
        // protected method
        protected void display() {
            System.out.println("I am an animal");
        }
    }

    class ProtectedExDog extends Animal1 {
        public static void main(String[] args) {

            // create an object of Dog class
            ProtectedExDog dog = new ProtectedExDog();
            // access protected method
            dog.display();
        }
    }


