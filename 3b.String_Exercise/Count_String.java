// Q2. Write a Java Program for Counting how many times a substring appears in a main string
// using user defined function countOccurrences().

package prg3;

public class Count_String {

    // User-defined method to count occurrences of substring in main string
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        // Loop to find all occurrences of subStr in mainStr
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move index past this occurrence
        }

        return count;
    }

    public static void main(String[] args) {
        String mainString = "abababababa";
        String subString = "aba";

        int occurrences = countOccurrences(mainString, subString);
        System.out.println("The substring '" + subString + "' appears " + occurrences + " times in the main string.");
    }
}
