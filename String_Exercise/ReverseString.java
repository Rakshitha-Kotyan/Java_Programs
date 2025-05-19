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


