// 6. Write a java program for getting different colors through ArrayList interface 
// and delete nth element from the ArrayList object by using remove by index

package prg1;

import java.util.ArrayList;
import java.util.List;

public class Delete_Arraylist {
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

        // Define which element to remove (nth element - zero-based index)
        int n = 3;  // Example: remove the 4th element (index 3)

        // Check if index is within bounds
        if (n >= 0 && n < colors.size()) {
            // Remove the nth element
            String removedColor = colors.remove(n);
            System.out.println("Removed element at index " + n + ": " + removedColor);
        } else {
            System.out.println("Index " + n + " is out of bounds.");
        }

        // Printing the updated list
        System.out.println("Updated colors: " + colors);
    }
}
