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
