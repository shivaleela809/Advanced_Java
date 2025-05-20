// Write a Java program to insert the specified element at the end of a linked list
// (using l_listobj.offerLast("Pink"))

package prg1;

import java.util.LinkedList;

public class Insert_Linkedlist {
    public static void main(String[] args) {
        // Creating a LinkedList to store colors
        LinkedList<String> colors = new LinkedList<>();

        // Adding initial colors to the LinkedList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Printing the original LinkedList
        System.out.println("Original LinkedList: " + colors);

        // Inserting the specified element "Pink" at the end using offerLast()
        colors.offerLast("Pink");

        // Printing the updated LinkedList
        System.out.println("LinkedList after adding 'Pink' at the end: " + colors);
    }
}
