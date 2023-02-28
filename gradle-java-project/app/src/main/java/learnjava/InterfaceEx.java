package learnjava;

 class Rectangle1 implements InterfaceShape {
    /*an interface is a collection of abstract methods and constants that can be implemented by a class.
     An interface defines a contract that a class must follow if it implements the interface.
     */
    private double length;
    private double width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        Rectangle1 rectangle = new Rectangle1(5, 10);
        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
