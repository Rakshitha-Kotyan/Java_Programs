
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
