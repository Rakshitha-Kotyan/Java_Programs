//3c. String Exercise progams
/*Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/

import java.util.*;
public class CapitalizeWords {
    public static String capitalizeWords(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase())
                  .append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        System.out.println("Capitalized: " + capitalizeWords(input));
        sc.close();
    }
}

/*Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
// Q7: Truncate string and add ellipsis
import java.util.*;
public class Truncate {
    public static String truncate(String str, int maxLength) {
        if (str.length() <= maxLength) return str;
        return str.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter max length: ");
        int len = sc.nextInt();
        System.out.println("Truncated: " + truncate(input, len));
        sc.close();
    }
}

/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/
// Q8: Check if string contains only numeric characters
import java.util.*;
public class IsNumeric {
    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Is Numeric? " + isNumeric(input));
        sc.close();
    }
}

/*Q9. Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
// Q9: Generate a random string of specified length
import java.util.*;
public class GenerateRandomString {
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length for random string: ");
        int len = sc.nextInt();
        System.out.println("Random String: " + generateRandomString(len));
        sc.close();
    }
}

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
