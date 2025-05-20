// Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis
// using user defined function truncate().

package prg3;

public class Truncate_String {

    // User-defined method to truncate a string to maxLength and add "..." if truncated
    public static String truncate(String str, int maxLength) {
        if (str == null || maxLength <= 0) {
            return "";
        }
        if (str.length() <= maxLength) {
            return str;
        }
        // If string is longer, truncate and add ellipsis
        return str.substring(0, maxLength) + "...";
    }

    public static void main(String[] args) {
        String input = "Artificial Intelligence and Emerging Technologies";
        int maxLen = 20;

        System.out.println("Original String: " + input);
        String truncated = truncate(input, maxLen);
        System.out.println("Truncated String: " + truncated);
    }
}
