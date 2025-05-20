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
