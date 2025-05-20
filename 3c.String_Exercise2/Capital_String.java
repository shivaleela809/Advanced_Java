// Q6. Write a Java Program for Capitalizing the first letter of each word
// using user defined function capitalizeWords().

package prg3;

public class Capital_String {

    // User-defined method to capitalize first letter of each word
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split("\\s+"); // split by whitespace
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter + rest of the word lowercase
                capitalized.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    capitalized.append(word.substring(1).toLowerCase());
                }
                capitalized.append(" ");
            }
        }

        // Remove trailing space and return
        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello world! welcome to aiet.";
        System.out.println("Original String: " + input);
        String output = capitalizeWords(input);
        System.out.println("Capitalized String: " + output);
    }
}
