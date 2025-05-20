/*4. Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
// 4. Extract 1st and 2nd elements using subList()
import java.util.*;
public class ExtractColors {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Orange");
        ls.add("geen");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");
        System.out.println(ls);
        System.out.println("using sublist:");
        System.out.println(ls.subList(0, 2));
    }
}
