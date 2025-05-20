// 4. Write a java program for getting different colors through ArrayList interface 
// and sort them using Collections.sort(ArrayListObj)

package prg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_Arraylist {
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

        // Sorting the ArrayList
        Collections.sort(colors);

        // Printing the sorted list
        System.out.println("Sorted colors: " + colors);
    }
}
