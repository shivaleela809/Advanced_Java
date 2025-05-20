// Q5. Write a Java Program for Eliminating all whitespace characters from a string
// using user defined function removeWhitespace().

package prg3;

public class Eliminate_String {

    // User-defined method to remove all whitespace characters from a string
    public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }
        // Replace all whitespace characters (space, tab, newline, etc.) with empty string
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String input = "  Hello \t World \n This is  AIET  ";
        System.out.println("Original String: '" + input + "'");
        String noWhitespace = removeWhitespace(input);
        System.out.println("String after removing all whitespace: '" + noWhitespace + "'");
    }
}
