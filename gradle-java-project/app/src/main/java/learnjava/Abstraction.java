package learnjava;


    /*We can implement abstraction by using abstract classes and interfaces.
    Data Abstraction is the property by virtue of which only the
    essential details are displayed to the user*/
    

abstract class Shape {
    abstract String draw();
 }
 
 class Rectangle extends Shape {
    String draw() {
    
    return "Drawing a rectangle";
    }
 }
 
 class Circle extends Shape {
    String draw() {
    return "Drawing a circle";
    }
 }

 
 
