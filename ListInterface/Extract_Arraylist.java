// 5. Write a java program for getting different colors through ArrayList interface 
// and extract the elements 1st and 2nd from the ArrayList object by using SubList()

package prg1;

import java.util.ArrayList;
import java.util.List;

public class Extract_Arraylist {
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

        // Extracting the 1st and 2nd elements using subList (index 0 to 2)
        List<String> subList = colors.subList(0, 2);

        // Printing the extracted sublist
        System.out.println("Extracted elements (1st and 2nd): " + subList);
    }
}
