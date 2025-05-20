// Q4. Write a Java Program for Checking if a string reads the same backward as forward 
// (ignoring case and punctuation) using user defined function isPalindrome().

package prg3;

public class ReverseChecking_String {

    // User-defined method to check palindrome ignoring case and punctuation
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Remove all non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use two-pointer technique to check palindrome
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "Hello World";
        String test3 = "No lemon, no melon";

        System.out.println("'" + test1 + "' is palindrome? " + isPalindrome(test1)); // true
        System.out.println("'" + test2 + "' is palindrome? " + isPalindrome(test2)); // false
        System.out.println("'" + test3 + "' is palindrome? " + isPalindrome(test3)); // true
    }
}
