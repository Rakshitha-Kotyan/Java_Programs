
/*1. Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
// 1. Iterate from specified position using iterator
import java.util.*;
public class IterateFromPosition {
    public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        ls.add("Orange");
        ls.add("geen");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");
        Iterator<String> iterator = ls.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


