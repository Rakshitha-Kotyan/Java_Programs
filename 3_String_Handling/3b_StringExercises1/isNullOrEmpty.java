//3b. String Exercise progams
/*Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().*/
// Q1: Check if a string is null or contains only whitespace
import java.util.*;
public class IsNullOrEmpty {
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Is Null or Empty? " + isNullOrEmpty(input));
        sc.close();
    }
}
