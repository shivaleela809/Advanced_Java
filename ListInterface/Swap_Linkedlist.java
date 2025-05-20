// Write a Java program that swaps two elements (first and third elements) in a linked list 
// (using Collections.swap(l_list, 0, 2))

package prg1;

import java.util.Collections;
import java.util.LinkedList;

public class Swap_Linkedlist {
    public static void main(String[] args) {
        // Creating a LinkedList to store colors
        LinkedList<String> colors = new LinkedList<>();

        // Adding colors to the LinkedList
        colors.add("Red");     // index 0
        colors.add("Green");   // index 1
        colors.add("Blue");    // index 2
        colors.add("Yellow");  // index 3
        colors.add("Purple");  // index 4

        // Printing original LinkedList
        System.out.println("Original LinkedList: " + colors);

        // Swapping first (index 0) and third (index 2) elements
        Collections.swap(colors, 0, 2);

        // Printing LinkedList after swap
        System.out.println("LinkedList after swapping first and third elements: " + colors);
    }
}
