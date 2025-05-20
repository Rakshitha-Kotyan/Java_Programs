/*2 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/
import java.util.*;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = " World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // String Searching
        System.out.println("str1 contains 'ell'? " + str1.contains("ell"));
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
        System.out.println("Last index of 'l' in str1: " + str1.lastIndexOf('l'));

        // Substring Operations
        System.out.println("Substring from index 1: " + str1.substring(1));
        System.out.println("Substring (1, 4): " + str1.substring(1, 4));

        // String Modification
        System.out.println("str1 toUpperCase: " + str1.toUpperCase());
        System.out.println("str2 toLowerCase: " + str2.toLowerCase());
        System.out.println("Replace 'l' with 'p': " + str1.replace('l', 'p'));

        // Whitespace Handling
        String withSpaces = "  Hello World!  ";
        System.out.println("Before trim: '" + withSpaces + "'");
        System.out.println("After trim: '" + withSpaces.trim() + "'");

        // String Concatenation
        String combined = str1.concat(str2);
        System.out.println("Concatenated string: " + combined);

        // String Splitting
        String fruits = "Apple,Banana,Cherry";
        String[] fruitArray = fruits.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        sb.insert(5, " and");
        sb.replace(6, 9, "JAVA");
        System.out.println("StringBuilder result: " + sb.toString());

        // String Formatting
        int age = 20;
        String name = "Ramy’s Love";
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // Email Validation
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        if (email.contains("@") && email.startsWith("user") && email.endsWith(".com")) {
            System.out.println("Valid email format");
        } else {
            System.out.println("Invalid email format");
        }

        sc.close();
    }
}
