// Q1. Write a Java Program for Checking if a given string is null or contains only whitespace 
// using user defined function isNullOrEmpty().

package prg3;

public class Checking_String {

    // User-defined method to check if string is null or empty (only whitespace)
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        String test1 = null;
        String test2 = "    ";
        String test3 = "Hello World";

        System.out.println("Test1 is null or empty? " + isNullOrEmpty(test1));  // true
        System.out.println("Test2 is null or empty? " + isNullOrEmpty(test2));  // true
        System.out.println("Test3 is null or empty? " + isNullOrEmpty(test3));  // false
    }
}
