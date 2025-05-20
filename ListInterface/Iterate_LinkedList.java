// 1. Write a Java program to iterate through all elements in a linked list starting at the
// specified position (2nd) using iterator
// (hint: Iterator iteratorobj = listobj.listIterator(1))

package prg1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterate_LinkedList {
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

        // Creating an iterator starting from 2nd element (index 1)
        ListIterator<String> iterator = colors.listIterator(1);

        System.out.println("Iterating from the 2nd element:");

        // Iterating and printing elements starting from 2nd element
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
