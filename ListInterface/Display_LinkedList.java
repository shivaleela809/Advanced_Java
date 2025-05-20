// 4. Write a Java program to display elements and their positions in a linked list 
// (using l_listobj.get(p))

package prg1;

import java.util.LinkedList;

public class Display_LinkedList {
    public static void main(String[] args) {
        // Creating a LinkedList to store colors
        LinkedList<String> colors = new LinkedList<>();

        // Adding colors to the LinkedList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display elements and their positions
        System.out.println("Elements and their positions in the LinkedList:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }
}
