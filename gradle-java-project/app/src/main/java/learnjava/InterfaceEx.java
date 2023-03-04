package learnjava;

 class InterfaceEx  implements InterfaceShape {
    /*an interface is a collection of abstract methods and constants that can be implemented by a class.
     An interface defines a contract that a class must follow if it implements the interface.
     */
    private double length;
    private double width;

    public InterfaceEx(double length, double width) {
        this.length=length;
        this.width=width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}


