//1c. Linked List Programs

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

/*3. Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/
import java.util.*;
public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Orange");
        ls.add("geen");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");
        System.out.println(ls);
        ls.addLast("pink");
        System.out.println(ls);
    }
}

/*4. Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/
import java.util.*;
public class DisplayElementsWithIndex {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Orange");
        ls.add("geen");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");
        for (int i = 0; i < ls.size(); i++) {
            System.out.println("index: " + i + " value: " + ls.get(i));
        }
    }
}

/*5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/
import java.util.*;
public class SwapElements {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Orange");
        ls.add("geen");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");
        System.out.println("Before swapping");
        System.out.println(ls);
        Collections.swap(ls, 0, 2); // Swap first and third elements (index 0 and 2)
        System.out.println("After swapping");
        System.out.println(ls);
    }
}
