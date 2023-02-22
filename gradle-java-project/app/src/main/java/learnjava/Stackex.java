package learnjava;

import java.util.Iterator;
import java.util.Stack;

public class Stackex {
    /*a stack is a data structure that stores a collection of elements and follows the Last-In-First-Out 
    (LIFO) principle. This means that the last element added to the stack will be the first one removed. */
        // Main Method
        public static void main(String args[]) {
            Stack<String> stack = new Stack<String>();
            stack.push("Geeks");
            stack.push("For");
            stack.push("Geeks");
            stack.push("Geeks");

            // Iterator for the stack
            Iterator<String> itr = stack.iterator();

            // Printing the stack
            while (itr.hasNext()) {
                System.out.print(itr.next() + " ");
            }

            System.out.println();

            stack.pop();

            // Iterator for the stack
            itr = stack.iterator();

            // Printing the stack
            while (itr.hasNext()) {
                System.out.print(itr.next() + " ");
            }
        }

    }


    

