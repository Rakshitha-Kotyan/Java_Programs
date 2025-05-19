/*2. Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
// 2. Iterate linked list in reverse order using descendingIterator()
import java.util.*;
public class IterateReverseOrder {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Orange");
        ls.add("geen");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");
        Iterator<String> iterator = ls.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
