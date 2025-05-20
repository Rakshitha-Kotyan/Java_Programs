/*5. Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/
// 5. Remove a specific color from ArrayList using remove(Object)
import java.util.*;
public class RemoveNthColor {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Orange");
        ls.add("green");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");
        String Str = "green";
        System.out.println(ls);
        System.out.println("Removing the nth Element: " + ls.remove(Str));
        System.out.println(ls);
    }
}
