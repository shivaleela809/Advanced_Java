// Q8. Write a Java Program for Verifying if a string contains only numeric characters
// using user defined function isNumeric().

package prg3;

public class IsNumeric_String {

    // User-defined method to check if string contains only numeric characters
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        // Check each character to be a digit
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test1 = "123456";
        String test2 = "1234a56";
        String test3 = "";

        System.out.println("'" + test1 + "' is numeric? " + isNumeric(test1)); // true
        System.out.println("'" + test2 + "' is numeric? " + isNumeric(test2)); // false
        System.out.println("Empty string is numeric? " + isNumeric(test3));    // false
    }
}
