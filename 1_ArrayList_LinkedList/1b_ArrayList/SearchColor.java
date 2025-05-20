//1b. Array List programs

/*1. Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/
// 1. Search whether color "red" is available or not
import java.util.*;
public class SearchColor {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Orange");
        ls.add("geen");
        ls.add("pink");
        ls.add("red");
        System.out.println(ls);
        if (ls.contains("red")) {
            System.out.println("available");
        } else {
            System.out.println("available not");
        }
    }
}
