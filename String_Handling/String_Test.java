// 2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder
// for appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder.
// Justify your answer which one is better.

package prg3;

public class String_Test {
    public static void main(String[] args) {
        final int iterations = 10000;
        String toAppend = "AIET";

        // Test StringBuffer performance
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(toAppend);
        }
        long endTimeBuffer = System.currentTimeMillis();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Test StringBuilder performance
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(toAppend);
        }
        long endTimeBuilder = System.currentTimeMillis();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Display results
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ms");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ms");

        // Justification:
        if (durationBuffer > durationBuilder) {
            System.out.println("\nStringBuilder is faster than StringBuffer for appending operations.");
        } else if (durationBuffer < durationBuilder) {
            System.out.println("\nStringBuffer is faster than StringBuilder for appending operations.");
        } else {
            System.out.println("\nBoth StringBuffer and StringBuilder performed equally.");
        }
    }
}
