/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/
public class PerformanceTest {

    public static void main(String[] args) {

        // Test with StringBuffer
        StringBuffer buffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            buffer.append("AIET");
        }

        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");


        // Test with StringBuilder
        StringBuilder builder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            builder.append("AIET");
        }

        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");


        // Comparison Result
        if (durationBuffer > durationBuilder) {
            System.out.println("\n✅ StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("\n✅ StringBuffer is faster than StringBuilder.");
        }
    }
}
