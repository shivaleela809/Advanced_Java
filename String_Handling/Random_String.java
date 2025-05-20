// Q9. Write a Java Program for Creating a random string of a specified length
// using user defined function generateRandomString().

package prg3;

import java.security.SecureRandom;

public class Random_String {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom random = new SecureRandom();

    // User-defined method to generate random string of given length
    public static String generateRandomString(int length) {
        if (length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int length = 10;
        String randomStr = generateRandomString(length);

        System.out.println("Random string of length " + length + ": " + randomStr);
    }
}
