 
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
