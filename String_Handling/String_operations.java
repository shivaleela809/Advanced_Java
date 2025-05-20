// 3a. Develop a java program for performing various string operations with different string
// handling functions directed as follows:
// String Creation and Basic Operations, Length and Character Access, String Comparison,
// String Searching, Substring Operations, String Modification, Whitespace Handling,
// String Concatenation, String Splitting, StringBuilder Demo, String Formatting,
// Validate Email with contains(), startsWith(), and endsWith()

package prg3;

public class String_operations {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str2: " + str2.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3? " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3? " + str1.equalsIgnoreCase(str3));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("Index of 'fox' in sentence: " + sentence.indexOf("fox"));
        System.out.println("Does sentence contain 'quick'? " + sentence.contains("quick"));

        // 5. Substring Operations
        System.out.println("Substring of sentence (10 to 15): " + sentence.substring(10, 15));

        // 6. String Modification
        String replaced = sentence.replace("fox", "cat");
        System.out.println("After replacing 'fox' with 'cat': " + replaced);
        String lower = sentence.toLowerCase();
        String upper = sentence.toUpperCase();
        System.out.println("Lowercase: " + lower);
        System.out.println("Uppercase: " + upper);
        String trimmed = "   padded string   ".trim();
        System.out.println("Trimmed string: '" + trimmed + "'");

        // 7. Whitespace Handling
        String spaced = "  Hello World  ";
        System.out.println("Original: '" + spaced + "'");
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenated String: " + concat);

        // 9. String Splitting
        String csv = "apple,banana,orange,grape";
        String[] fruits = csv.split(",");
        System.out.println("Splitting CSV string:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder();
        sb.append("Start");
        sb.append(" -> ");
        sb.append("End");
        System.out.println("StringBuilder content: " + sb.toString());

        // 11. String Formatting
        String formatted = String.format("Name: %s, Age: %d, GPA: %.2f", "Alice", 23, 8.56);
        System.out.println("Formatted string: " + formatted);

        // 12. Validate Email with contains(), startsWith(), and endsWith()
        String email = "example.user@gmail.com";
        boolean valid = email.contains("@") && email.startsWith("example") && email.endsWith(".com");
        System.out.println("Is the email '" + email + "' valid? " + valid);

        // Another email test
        String email2 = "user@example.org";
        boolean valid2 = email2.contains("@") && email2.startsWith("example") && email2.endsWith(".com");
        System.out.println("Is the email '" + email2 + "' valid? " + valid2);
    }
}
