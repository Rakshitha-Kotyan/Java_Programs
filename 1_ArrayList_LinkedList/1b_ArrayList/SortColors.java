/*3. Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/
// 3. Sort colors using Collections.sort()
import java.util.*;
public class SortColors {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Orange");
        ls.add("geen");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");
        System.out.println("Before sorting:");
        System.out.println(ls);
        Collections.sort(ls);
        System.out.println("After sorting:");
        System.out.println(ls);
    }
}
