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
