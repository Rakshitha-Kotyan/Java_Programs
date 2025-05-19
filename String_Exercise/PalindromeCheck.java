 /*Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():*/
// Q4: Check if string is palindrome (ignoring case and punctuation)
import java.util.*;
public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String input = sc.nextLine();
        System.out.println("Is Palindrome? " + isPalindrome(input));
        sc.close();
    }
}
