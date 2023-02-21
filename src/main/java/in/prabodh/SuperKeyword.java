package in.prabodh;

 class Base {
        ////we cannt use its as an identifier.super keyword is used to access methods of the parent class
        //The most common use of super keyword is that it eliminates the
        // confusion between the superclasses and subclasses that have methods with same name.
        int a = 10;   // instance variable

        // static variable
        static int b = 20;

 }

    class SuperKeywordEx extends Base {
        void rr()
        {
            // referring parent class(i.e, class Parent)
            // instance variable(i.e, a)
            System.out.println(super.a);

            // referring parent class(i.e, class Parent)
            // static variable(i.e, b)
            System.out.println(super.b);
        }

        public static void main(String[] args)
        {
            new SuperKeywordEx().rr();
        }
    }

