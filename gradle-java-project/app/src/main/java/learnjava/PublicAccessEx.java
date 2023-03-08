package learnjava;

 class PublicAccessEx {
    /*A class member declared as "public" can be accessed from any class, including its subclasses and
     classes in different packages. */
    // public variable
    public int legCount=4;

    // public method
    public String display() {
    
        return " I have 4 legs.";
    }
}

