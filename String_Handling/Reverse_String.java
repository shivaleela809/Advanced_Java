// Q3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().

package prg3;

public class Reverse_String {

    // User-defined method to reverse a string
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String original = "Hello World!";
        String reversed = reverseString(original);

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
