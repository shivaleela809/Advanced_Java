// Q10. Write a Java Program for Counting the number of words in a string
// using user defined function countWords().

package prg3;

public class CountWords_String {

    // User-defined method to count number of words in a string
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        // Split the string by one or more whitespace characters
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String test1 = "Hello world, welcome to AIET.";
        String test2 = "    ";
        String test3 = null;

        System.out.println("Words in '" + test1 + "': " + countWords(test1));  // 5
        System.out.println("Words in empty string: " + countWords(test2));       // 0
        System.out.println("Words in null string: " + countWords(test3));        // 0
    }
}
