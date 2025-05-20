/*Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
// Q10: Count the number of words in a string
import java.util.*;
public class CountWords {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        System.out.println("Word Count: " + countWords(input));
        sc.close();
    }
}
