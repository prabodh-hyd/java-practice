package in.prabodh;

import in.prabodh.math.Calculator;

public class PackageEx {
    /*a package is a collection of related classes and interfaces. Packages are used to organize and
    modularize code, and they help to prevent naming conflicts.
     */

    public static void main(String[] args) {
        int result = Calculator.add(5, 10);
        System.out.println("5 + 10 = " + result);
    }
}

