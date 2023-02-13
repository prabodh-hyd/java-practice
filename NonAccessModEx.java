class StaticNonAccessMod {
       //static non access modifier example.
        // static variable
        static int count = 0;
        void myMethod()
        {
            count++;
            System.out.println(count);
        }
    }
    class NonAccessModEx {
        public static void main(String[] args)
        {
            // first object creation
            StaticNonAccessMod obj1 = new StaticNonAccessMod();

            // method calling of first object
            obj1.myMethod();

            // second object creation
            StaticNonAccessMod obj2
                    = new StaticNonAccessMod();

            // method calling of second object
            obj2.myMethod();
        }
    }


