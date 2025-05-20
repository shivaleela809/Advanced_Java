// 1. Write a java program for getting different colors through ArrayList interface 
// and search whether the color "Red" is available or not.

package prg1;

import java.util.ArrayList;
import java.util.List;

public class Search_ArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList to store colors
        List<String> colors = new ArrayList<>();

        // Adding colors to the ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Purple");
        colors.add("Orange");

        // Printing all the colors in the list
        System.out.println("Available colors: " + colors);

        // Searching for the color "Red"
        if (colors.contains("Red")) {
            System.out.println("The color 'Red' is available in the list.");
        } else {
            System.out.println("The color 'Red' is not available in the list.");
        }
    }
}
