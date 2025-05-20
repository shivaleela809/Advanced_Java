// 2. Write a java program for getting different colors through ArrayList interface 
// and remove the 2nd element and color "Blue" from the ArrayList.

package prg1;

import java.util.ArrayList;
import java.util.List;

public class Remove_ArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList to store colors
        List<String> colors = new ArrayList<>();

        // Adding colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Orange");

        // Printing the original list
        System.out.println("Original colors: " + colors);

        // Removing the 2nd element (index 1)
        if (colors.size() > 1) {
            String removedElement = colors.remove(1); // Removing by index
            System.out.println("Removed 2nd element (" + removedElement + "): " + colors);
        } else {
            System.out.println("List has fewer than 2 elements, cannot remove 2nd element.");
        }

        // Removing the color "Blue"
        if (colors.remove("Blue")) { // Removing by value
            System.out.println("Removed color 'Blue': " + colors);
        } else {
            System.out.println("Color 'Blue' not found in the list.");
        }

        // Final state of the list
        System.out.println("Final colors: " + colors);
    }
}
