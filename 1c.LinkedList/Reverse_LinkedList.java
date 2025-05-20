// 2. Write a Java program to iterate a linked list in reverse order 
// (using objlist.descendingIterator())

package prg1;

import java.util.Iterator;
import java.util.LinkedList;

public class Reverse_LinkedList {
    public static void main(String[] args) {
        // Creating a LinkedList to store colors
        LinkedList<String> colors = new LinkedList<>();

        // Adding colors to the LinkedList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Orange");

        // Printing the original list
        System.out.println("Original LinkedList: " + colors);

        // Getting the descending iterator to traverse in reverse order
        Iterator<String> descendingIterator = colors.descendingIterator();

        System.out.println("Iterating LinkedList in reverse order:");

        // Iterating and printing elements in reverse order
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}
