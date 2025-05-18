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

/*Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
// Q2: Count how many times a substring appears
import java.util.*;
public class CountOccurrences {
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0, index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String main = sc.nextLine();
        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();
        System.out.println("Occurrences: " + countOccurrences(main, sub));
        sc.close();
    }
}


  /*Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
  import java.util.*;
public class ReverseString {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        System.out.println("Reversed: " + reverseString(input));
        sc.close();
    }
}


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

/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
// Q5: Remove all whitespace from a string
import java.util.*;
public class RemoveWhitespace {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to remove whitespaces: ");
        String input = sc.nextLine();
        System.out.println("Without Whitespaces: '" + removeWhitespace(input) + "'");
        sc.close();
    }
}
